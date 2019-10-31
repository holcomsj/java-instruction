package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieDB extends BaseDB {
	public List<Movie> list() {
		List<Movie> movieList = new ArrayList<>();
		String sql = "Select * from movie";
		try (PreparedStatement ps = getConnection().prepareStatement(sql);
			 ResultSet rs = ps.executeQuery(sql)) {
			while (rs.next()) {
				Movie m = getMovieFromResultsSet(rs);
				movieList.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return movieList;
	}

	public Movie get(int id) {
		Movie movie = null;
		String sql = "Select * from movie where id = ?";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				movie = getMovieFromResultsSet(rs);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return movie;
	}

	public int add(Movie m) {
		int rowCount = 0;
		String sql = "Insert into movie (title, rating,year, director) values" +
					 " (?,?,?,?)";
		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setString(1, m.getTitle());
			ps.setString(2, m.getRating());
			ps.setInt(3, m.getYear());
			ps.setString(4, m.getDirector());
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	public int update(Movie m) {
		int rowCount = 0;
		String sql = "Update movie set year = ? where id = ?";

		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, m.getYear());
			ps.setInt(2, m.getId());
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	public int delete(Movie m) {
		int rowCount = 0;
		String sql = "Delete from movie where id = ?";

		try (PreparedStatement ps = getConnection().prepareStatement(sql)) {
			ps.setInt(1, m.getId());
			rowCount = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	private Movie getMovieFromResultsSet(ResultSet rs) throws SQLException {
		// Get movie from results set
		int id = rs.getInt(1);
		String title = rs.getString(2);
		String rating = rs.getString(3);
		int year = rs.getInt(4);
		String director = rs.getString(5);
		Movie m = new Movie(id, title, rating, year, director);
		return m;
	}
}
