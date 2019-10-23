import java.util.Scanner;

public class DiceRollerAppExtended {

	public static void main(String[] args) {
		System.out.println("Dice Roller\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll the Dice? (y/n):");
		String choice = sc.next();
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("How many sides are you looking for?");
			int side = sc.nextInt();
			System.out.println("How many dice do you want to roll?");
			int numDice = sc.nextInt();
			
			int total = 0;
			
			for (int i = numDice; i != 0; i--) {
			int diceRoll = diceRoll(side);
			total += diceRoll;
			}
			
			int max = side * numDice;
			double avg = (((side + 1)/2)*numDice);
			
			
			
			formattedString(total, numDice, max, avg, side);
			
			
			System.out.println("Roll again? (y/n)");
			choice = sc.next();
			
			
			
			
		}
		sc.close();
		System.out.println("Happy Huntering");
	}
	
	public static int diceRoll(int sides) {
		int roll = (int) (Math.random() * sides) + 1;
		return roll;
		
	}
	
	public static void formattedString(int total, int numDice, int max, double avg, int side) {
		System.out.println("Total:\t" + total+"\n");
		
		if (total == numDice && side == 1) {
			System.out.println("What did you expect");
		}
		else if (total == numDice) {
			System.out.println("That was a really bad roll");
		}
		else if (total == max) {
			System.out.println("That's some nice shooting Tex");
		}
		else if (total > avg) {
			System.out.println("Hey, not bad. Still above average!");
		}
		
	}

}
