import java.util.InputMismatchException;
import java.util.Scanner;

public class CommonDivisorMethodsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Common Divisor Calculator");

		Scanner sc = new Scanner(System.in);
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {
			int y = getInt("Enter bigger number: ", sc);

			int x = getInt("Enter smaller number: ", sc);

			while (x != 0) {
				while (y >= x) {
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

	private static int getInt(String prompt, Scanner sc) {
		boolean isValid = false;
		int i = 0;
		while (!isValid) {
			try {
				System.out.println(prompt);
				i = sc.nextInt();
				isValid = true;

			} catch (InputMismatchException ime) {
				System.out.println("Invalid entry, try again");
				sc.nextLine();
				continue;
			}
		}
		return i;
	}
}
