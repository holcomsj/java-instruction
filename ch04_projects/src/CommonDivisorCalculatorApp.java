import java.util.Scanner;

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Common Divisor Calculator");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter bigger number: ");
			int y = sc.nextInt();
			
			System.out.println("Enter lesser number: ");
			int x = sc.nextInt();
			
			while (x != 0) {
				while(y >= x) {
					y -= x;
				}
				int temp = x;
				x = y;
				y = temp;
			}
			System.out.println("Greatest Common Divisor is " + y);
			
			
			
				
			System.out.println("Continue?(y/n)");
			choice = sc.next();
				
			}
	
		sc.close();
		System.out.println("Bye");

	}
}


