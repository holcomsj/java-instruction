import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		int limit = 100;

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("I'm thinking of a number between one and " + limit);
			System.out.println("Try to guess it!\n");

			int randNum = (int) ((Math.random() * 100) + 1);
			int count = 0;
			boolean isGuessed = false;

			while (!isGuessed) {
				
				int guess = Console.getIntWithinRange("Enter number", 0, 101);
				count++;
				

				if (guess == randNum) {
					successStatement(count);
					isGuessed = true;
				} else if (guess < randNum - 10) {
					System.out.println("You are way too low, amigo");
					continue;
				} else if (guess < randNum) {
					System.out.println("You are too low");
					continue;
				} else if (guess > randNum + 10) {
					System.out.println("The amount you entered is too damn high");
					continue;
				} else {
					System.out.println("You are too high");
					continue;
				}
			}
			choice = getString(sc, "Try again? (y/n)");

		}

	}

	public static void successStatement(int count) {
		System.out.println("You guessed it in " + count + " tries");
		if (count <= 3) {
			System.out.println("You're a wizard Harry");
		} else if (count > 3) {
			System.out.println("Not too shabby");
		} else if (count >= 7) {
			System.out.println("I believed in you Anakin");
		}
	}


}
