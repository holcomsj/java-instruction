package ui;

import java.time.LocalDate;
import java.util.List;

import business.Actor;
import business.Movie;
import db.ActorDB;
import db.MovieDB;
import util.Console;

public class BmdbConsoleApp {
	
	private static MovieDB moviesDB = new MovieDB();
	private static ActorDB actorDb = new ActorDB();

	public static void main(String[] args) {
		System.out.println("Bmdb Console App\n");
		
		int choice = 0;
		
		while(choice != 99) {
			choice = Console.getInt(getMenu(), 0, 100);
		
			switch (choice) {
			case 1:
				List<Movie> movies = moviesDB.list();
				for (Movie m: movies) {
					System.out.println(m);
				}
				break;
			case 2:
				List<Actor> actor = actorDb.list();
				for (Actor a: actor) {
					System.out.println(a);
				}
				break;
			case 3:
				System.out.println("Add a movie:");
				String t = Console.getString("Title: ");
				int y = Console.getInt("Year: ");
				String r = Console.getString("Rating: ");
				String d = Console.getString("Director: ");
				Movie m = new Movie(t, r, y, d);
				int rc = moviesDB.add(m);
				if (rc == 1) {
					System.out.println("Movie added successfully");
				}else {
					System.out.println("Error adding movie...check logs");
				}
			case 4:
				//update
				m = getMovie();
				if (m != null) {
					
					int year = Console.getInt("New year: ");
					m.setYear(year);
					rc = moviesDB.update(m);
					if (rc == 1) {
						System.out.println("Movie updated successfully");
					}else {
						System.out.println("Error updating movie year");
					}
				}else {
					System.out.println("Error...Movie id doesn't exist");
				}
				break;
			case 5:
				m = getMovie();
				if (m != null) {
					rc = moviesDB.delete(m);
					if (rc == 1) {
						System.out.println("Movie deleted successfully");
					}else {
						System.out.println("Error delete movie");
					}
				}else {
					System.out.println("Error...Movie id doesn't exist");
				}
				break;
			case 6:
				m = getMovie();
				if (m != null) {
					System.out.println("Movie: ");
					System.out.println(m);
					
				}else {
					System.out.println("Error...Movie id doesn't exist");
				}
				break;
			case 7:
				Actor a = getActor()	;
				if (a != null) {
					System.out.println("Actor: ");
					System.out.println(a);
				}else {
					System.out.println("Error..actor not found");
				}
				break;
			case 8:
				//add actor
				System.out.println("Add an actor:");
				String fn = Console.getString("First Name: ");
				String ln = Console.getString("Last Name: ");
				String g = Console.getString("Gender: ");
				String bd = Console.getString("Birthday(YYYY-MM-DD): ");
				LocalDate bDay = LocalDate.parse(bd);
				a = new Actor(fn, ln, g, bDay);
				rc = actorDb.add(a);
				if (rc == 1) {
					System.out.println("Actor added successfully");
				}else {
					System.out.println("Error adding actor...check logs");
				}
			case 9:
				//update
				a = getActor();
				if (a != null) {
					
					bd = Console.getString("New Birthday(YYYY-MM-DD): ");
					bDay = LocalDate.parse(bd);
					a.setBirthDate(bDay);
					rc = actorDb.update(a);
					if (rc == 1) {
						System.out.println("Actor updated successfully");
					}else {
						System.out.println("Error updating actor birthday");
					}
				}else {
					System.out.println("Error...actor id doesn't exist");
				}
				break;
			case 10:
				//delete
				a = getActor();
				if (a != null) {
					rc = actorDb.delete(a);
					if (rc == 1) {
						System.out.println("Actor deleted successfully");
					}else {
						System.out.println("Error deleting actor");
					}
				}else {
					System.out.println("Error...Movie id doesn't exist");
				}
				break;
				
				
			case 99:
				//exit
				break;
			default:
				System.out.println("Invaild Command.");
				break;
			}
		}
		System.out.println("Bye");
		
	}

	
	
	private static String getMenu() {
		String menu = "COMMAND:\n" +
					  "1 - List Movie\n" +
					  "2 - List Actor\n" +
					  "3 - Add Movie\n" +
					  "4 - Update Movie\n" +
					  "5 - Delete Movie\n" +
					  "6 - Get Movie\n" +
					  "7 - Get Actor\n" +
					  "8 - Add Actor\n" +
					  "9 - Update Actor\n" +
					  "10 - Delete Actor\n" +
					  "99 - Exit\n" +
					  "Command: ";
		return menu;

}
	private static Movie getMovie() {
		int id = Console.getInt("Id? ", 0, Integer.MAX_VALUE);
		Movie m = moviesDB.get(id);
		return m;
	}
	
	private static Actor getActor() {
		int id = Console.getInt("Id? ", 0, Integer.MAX_VALUE);
		Actor a = actorDb.get(id);
		return a;
	}
}
