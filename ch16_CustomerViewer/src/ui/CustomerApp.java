package ui;

import util.Console;


import business.CustomerDb;
import business.NoSuchCustomerException;

public class CustomerApp {

	public static void main(String[] args) throws NoSuchCustomerException {
		System.out.println("Customer Viewer");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			int custNum = Console.getInt("Enter customer number: ");
			try {
				System.out.println(CustomerDb.getCustomer(custNum));
				
			} finally {
				throw new NoSuchCustomerException(
				"No such customer found");
			}
			
		}

	}

}
