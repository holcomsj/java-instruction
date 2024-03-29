package UI;

import util.Console;

public class BattingAverageApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		int atBats = Console.getInt("Enter number of at bats");
		double sum = 0.0;
		int[] atBatArray = new int[atBats];
		int hits = 0;
		System.out.println("0 = Out, 1 = Single, 2 = Double, 3 = Triple, 4 = Homerun");
		for (int i = 0; i<atBats; i++) {
			atBatArray[i]= Console.getInt("Result for at bat " + (i + 1) + ": ");
			if (atBatArray[i] != 0) {
				hits++;
			}else {
				hits += 0;
			}
			sum += atBatArray[i];
		}
		double batAvg = hits/atBats;
		double slugs = sum/atBats;
		
		System.out.println("Batting average = " + batAvg);
		System.out.println("Slugging percentage = " + slugs);
		
		choice = Console.getYOrN("Continue?(y/n)");

	}

}
}
