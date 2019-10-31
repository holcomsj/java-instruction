package ui;

import java.sql.SQLException;
import java.util.List;

import business.Stuffy;
import db.StuffyDB;
import util.Console;


public class StuffyDespenserApp {
	private static StuffyDB sdb = new StuffyDB();

	public static void main(String[] args) throws SQLException {
		System.out.println("Hello");
		
		int command = 0;
		while(command != 6) {
			command = Console.getIntWithinRange(getMenu(), 0, 7);
			switch (command) {
				case 1: 
					System.out.println(sdb.getAll());
					break;
				case 2:
					int id = Console.getInt("ID: ");
					Stuffy s = getStuffy(id);
					break;
				case 3:
					String type = Console.getString("Type: ");
					String color = Console.getString("Color: ");
					String size = Console.getString("Size: ");
					int limbs = Console.getInt("Limbs: ");
					s = new Stuffy(type, color, size, limbs);
					int rowCount = sdb.add(s);
					System.out.println(rowCount+" rows affected");
					break;
				case 4:
					id = Console.getInt("ID: :");
					s = editStuffy(id);
					sdb.update(s);
					break;
				case 5:
					id = Console.getInt("ID: ");
					s = getStuffy(id);
					sdb.delete(s);
					
					break;
				case 6:
					//exit
					break;
				default:
					System.out.println("Invalid command");
					break;
		}
		}
		
		System.out.println("Bye!");

	}
	
	private static String getMenu() {
		String menu = "COMMAND:\n" +
					  "1 - List\n" +
					  "2 - Get\n" +
					  "3 - Add\n" +
					  "4 - Edit\n" +
					  "5 - Delete\n" +
					  "6 - Exit\n" +
					  "Command: ";
		return menu;
					  
	}
	
	private static Stuffy getStuffy(int id){
		
		Stuffy s = sdb.get(id);
		if (s != null) {
			System.out.println("Stuffy: ");
			System.out.println(s);
		} else {
			System.out.println("No stuffy exists for id: "+ id);
		}
		return s;
	}
	
	private static Stuffy editStuffy(int id) {
		
		Stuffy s = getStuffy(id);
		String choice = Console.getString("Which catergory are you updating?");
		if (choice.equalsIgnoreCase("type")) {
			s.setType(Console.getString("New type: "));
		} else if (choice.equalsIgnoreCase("color")) {
			s.setColor(Console.getString("New color: "));
		} else if (choice.equalsIgnoreCase("size")) {
			s.setSize("Enter a single letter for size: ");
		} else if (choice.equalsIgnoreCase("limbs")) {
			s.setLimbs(Console.getInt("Enter the number of limbs the Stuffy has: "));
			
		} else {
			System.out.println("Invalid choice");
		}
		return s;
	}

}
