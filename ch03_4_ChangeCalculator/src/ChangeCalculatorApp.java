import java.util.Scanner;

public class ChangeCalculatorApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Change Calculator");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter a number of cents (1-99)");
			
			int cents = sc.nextInt();
			
			int quarters = cents/25;
			int afterQuarters = cents % 25;
			int dimes = afterQuarters/10;
			int afterDimes = afterQuarters % 10;
			int nickels = afterDimes/5;
			int pennies = afterDimes%5;
			
			System.out.println("Quarters: " + quarters);
			System.out.println("Dimes:    " + dimes);
			System.out.println("Nickels:  " + nickels);
			System.out.println("Pennies:  " + pennies);
			
			
			System.out.println("Continue?(y/n)");
			choice = sc.next();
			
		}
		sc.close();
		System.out.println("GoodBye");
	}

}
