package ui;

import util.Console;
import business.JUnitTesting;

public class JUnitTestingApp {
	public static void main(String[] args) {
		JUnitTesting j = new JUnitTesting();
		System.out.println("Welcome to the app");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			int num = Console.getInt("Enter a number");
			String str = Console.getString("Enter a word or phrase");
			
			System.out.println(j.square(num));
			System.out.println(j.countA(str));
			
		}
			
	}

}
