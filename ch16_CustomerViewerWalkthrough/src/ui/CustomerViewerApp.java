package ui;

import business.Customer;
import business.CustomerDb;
import business.NoSuchCustomerException;
import util.Console;

public class CustomerViewerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the customer viewer app\n");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			int custNmb = Console.getInt("Enter a customer number: ");
			
			Customer c;
			try {
				c = CustomerDb.getCustomer(custNmb);
				System.out.println();
				System.out.println(c.getNameAndAddress());
			} catch (NoSuchCustomerException e) {
				System.out.println(e.getMessage());
			}
			choice = Console.getYOrN("Display another customer?(y/n)");
		}
		
		System.out.println("Bye");
	}

}
