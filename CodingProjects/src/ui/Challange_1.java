package ui;

import util.Console;

public class Challange_1 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Make Chocolate Challange");
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			int smallBars = Console.getInt("How many small bars do we have?");
			int bigBars = Console.getInt("How many big bars do we have?");
			int goal = Console.getInt("Whats our goal?");
			
			System.out.println(makeChocolate(smallBars, bigBars, goal));
			
			choice = Console.getString("Continue?(y/n)");
		}

	}
	
	public static int makeChocolate( int small, int big, int goal) {
		
		 goal = goal - big*5;
		 
		 if (goal > small) {
			 return -1;
		 }else {
			 return goal;
		 }
		
	}

}
