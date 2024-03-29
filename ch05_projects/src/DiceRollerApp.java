import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Roll the Dice? (y/n):");
		String choice = sc.next();
		
		while (choice.equalsIgnoreCase("y")) {
			
			int diceRoll1 = diceRoll();
			int diceRoll2 = diceRoll();
			int total = diceRoll1 + diceRoll2;
			
			formattedString(diceRoll1, diceRoll2, total);
			
			if (total == 2) {
				System.out.println("Snake Eyes");
			}
			else if (total == 12) {
				System.out.println("Boxcars");
			}
			
			System.out.println("Roll again? (y/n)");
			choice = sc.next();
			
			
			
			
		}
		sc.close();
	}
	
	public static int diceRoll() {
		int roll = (int) (Math.random() * 6) + 1;
		return roll;
		
	}
	
	public static void formattedString(int diceRoll1, int diceRoll2, int total) {
		System.out.println("Die 1:\t" + diceRoll1 );
		System.out.println("Die 2:\t" + diceRoll2 );
		System.out.println("Total:\t" + total+"\n");
		
	}

}
