package business;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class MovieCollection {
	List<Movie> movies = new ArrayList<>();
	
	public void add(Movie m) {
		movies.add(m);
	}
	
	public List<Movie> filterMovies(Predicate<Movie> condition){
		List<Movie> moviesFiltered = new ArrayList<>();
		for (Movie m: movies) {
			if (condition.test(m)) {
				moviesFiltered.add(m);
			}
		}
		return moviesFiltered;
	}
	
	public double getLowestRating() {
		double minRating = movies.stream()
				.map(m -> m.getRating())
				.reduce(5.0, (a,b) -> Math.min(a, b));
		return minRating;
	}

	public double getHighestRating() {
		double maxRating = movies.stream()
				.map(m -> m.getRating())
				.reduce(0.0, (a,b) -> Math.max(a, b));
		return maxRating;
	}

	public double getAverageRating() {
		double avgRating = movies.stream()
				.mapToDouble(m -> m.getRating())
				.sum();
		avgRating = avgRating/getSize();
		return avgRating;
	}
	
	public int getSize() {
		int size = movies.size();
		
		return size;
		
	}

	public Collection<Movie> getMovies() {
		return movies;
	}
}
	