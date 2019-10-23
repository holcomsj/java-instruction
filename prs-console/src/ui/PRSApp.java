package ui;

import java.util.ArrayList;
import java.util.List;

import business.User;
import util.Console;

public class PRSApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PRS Menu");
		List<User> user = new ArrayList<>();
		User a = new User(0, "user1", "user1", "User", "Userer", "1234567", "email", false, true);
		User b = new User(1, "user2", "user2", "Use", "Useer", "12345678", "email2", true, true);
		User c = new User(2, "user3", "user3", "Uer", "Uerer", "91234567", "email3", false, false);
		user.add(a);
		user.add(b);
		user.add(c);
		while (true) {
			String command = Console.getString(getDisplayMenu());
			if (command.equalsIgnoreCase("list")) {
				for (int i = 0; i < user.size(); i++) {
					System.out.println((i + 1) + ". " + user.get(i));
				}
			}

			else if (command.equalsIgnoreCase("get")) {
				int id = Console.getIntWithinRange("What is the table number " + 
													"identifier of the user", 0, user.size() + 1);
				for (int i = 0; i < user.size(); i++) {
					if (i == id - 1) {
						System.out.println(user.get(i));
					}
				}

			} else if (command.equalsIgnoreCase("add")) {
				user.add(addUserMenu());
			} else if (command.equalsIgnoreCase("edit")) {
				int index = Console.getIntWithinRange("Which user number are you" +
													  " changing?", 0, user.size() + 1);
				User u = user.get(index - 1);
				String newEmail = Console.getString("What is the new email of the user?");
				u.setEmail(newEmail);
				System.out.println("User " + u.getUserName() + " now has email set to " + u.getEmail());
			} else if (command.equalsIgnoreCase("delete")) {
				int index = Console.getIntWithinRange("What is the table number user are you getting" +
													  " rid of?", 0,
						user.size() + 1);
				System.out.println(user.remove(index - 1) + " was deleted\n");
			} else if (command.equalsIgnoreCase("exit")) {
				break; // don't change this one
			} else {
				System.out.println("Enter one of the choices available check " +
									"spelling.\n");
			}
		}
	}

	private static String getDisplayMenu() {
		String menu = "\nCOMMAND MENU\n" +
				"list - Show all users\n" + 
				"get - show a single user\n"+ 
				"add -  add a user\n" + 
				"edit - Edit a user\n" + 
				"delete - delete a user\n" + 
				"exit - Exit program\n"+ 
				"\n" + 
				"Command: \r\n";
		return menu;

	}

	private static User addUserMenu() {
		boolean reviewer = false;
		boolean admin = false;

		int id = Console.getInt("Please enter a unique numeric ID: ");
		String userName = Console.getString("Please enter username: ");
		String password = Console.getString("Please set a password: ");
		String firstName = Console.getString("Please enter first name: ");
		String lastName = Console.getString("Please enter last name: ");
		String phone = Console.getString("Please enter a phone number: ");
		String email = Console.getString("Please enter an email: ");
		String isReviewer = Console.getYOrN("Reviewer rights?(y/n): ");
		if (isReviewer.equalsIgnoreCase("y")) {
			reviewer = true;
		}
		String isAdmin = Console.getYOrN("Admin rights?(y/n) ");
		if (isAdmin.equalsIgnoreCase("y")) {
			admin = true;
		}
		User u = new User(id, userName, password, firstName, lastName, phone, email, reviewer, admin);
		return u;
	}
}
