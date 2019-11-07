package ui;

import util.Console;

public class Challange_3 {

	public static void main(String[] args) {
		System.out.println("Welcome to PIG DICE");
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			int plays = Console.getInt("How many times do you want to play?");
			System.out.println("Here we go");
			int highScore = 0;
			
			for (int i = 0; i<plays; i++) {
				int roll = 0;
				int sum = 0;
				while (roll!=1) {
					roll = diceRoll();
					//System.out.println(roll);
					sum +=roll;
				}
				if (sum > highScore) {
					highScore = sum;
				}
			}
			System.out.println("Played " + plays + " games");
			System.out.println("Highest Score = "+highScore);
			choice = Console.getString("Continue?(y/n)");
			
		}
		System.out.println("Bye");

	}
	
	public static int diceRoll() {
		int roll = (int) (Math.random() * 6) + 1;
		return roll;}

}
