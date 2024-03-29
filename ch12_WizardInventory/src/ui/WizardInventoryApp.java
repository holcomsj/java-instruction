package ui;

import java.util.ArrayList;
import java.util.List;

import util.Console;

public class WizardInventoryApp {

	public static void main(String[] args) {
		System.out.println("The Wizard Inventory Game\n");
		System.out.println("Command Menu\n" 
				+ "Show: list all items in inventory\n"
				+ "Grab: add an item to inventory\n"
				+ "Edit: edit the name of an item\n" 
				+ "Drop: remove an item from inventory"
				+ "Exit: leave the inventory\n");

		List<String> inventory = new ArrayList<>(4);
		inventory.add("Pointy Hat");
		inventory.add("Wizarding Staff");
		inventory.add("Dead Mouse");

		while (true) {
			String command = Console.getString("\nCommand: ");
			if (command.equalsIgnoreCase("show")) {
				for (int i = 0; i < inventory.size(); i++) {
					System.out.println((i+1) + ". " + inventory.get(i));
					
				}
			} else if (command.equalsIgnoreCase("grab")) {
				if (inventory.size() >= 4) {
					System.out.println("You are too weak to pick that up,"
							+ " drop something first\n");
				} else {
					String newItem = Console.getString("What are you grabbing?");
					inventory.add(newItem);
					System.out.println(newItem + " was added!\n");
				}
			} else if (command.equalsIgnoreCase("edit")) {
				int index = Console.getIntWithinRange("Which item number are you"
						+ " changing?", 0, inventory.size()+1);
				String newDescription = Console.getString("What's it to read now?");
				inventory.set((index - 1), newDescription);
				System.out.println("Item number " + index + " was updated!\n");
			} else if (command.equalsIgnoreCase("drop")) {
				int index = Console.getIntWithinRange("Which item number are you getting" 
						+ " rid of?", 0, inventory.size()+1);
				System.out.println(inventory.remove(index - 1) + " was dropped\n");
			} else if (command.equalsIgnoreCase("exit")) {
				break; // don't change this one
			} else {
				System.out.println("Enter one of the choices I gave you, maybe check " 
						+ "your spelling.\n");
			}
		}
		System.out.println("Bye!");
	}

}
