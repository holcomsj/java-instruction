package util;

import java.util.Scanner;

public class Console {

	private static Scanner sc = new Scanner(System.in);
	

	public static double getDouble(String prompt) {
		double d = 0.0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(String prompt, double min, double max) {
		double d = 0.0;
		boolean isValid = false;
		while (!isValid) {
			d = getDouble(prompt);
			if (d <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (d >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return d;
	}

	public static int getInt(String prompt) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (!isValid) {
			i = getInt(prompt);
			if (i <= min) {
				System.out.println("Error! Number must be greater than " + min + ".");
			} else if (i >= max) {
				System.out.println("Error! Number must be less than " + max + ".");
			} else {
				isValid = true;
			}
		}
		return i;
	}
	//this requires an non-empty entry 
	public static String getString(String prompt) {
		boolean isValid = false;
		String s = null;
		while (!isValid) {
			System.out.print(prompt);
			s = sc.nextLine();
			if (s!= null && s.equals("")) {
				System.out.println("Error - entry required. Try again.");
			}
			else {
				isValid = true;
			}
		}
		return s;
	}

	public static String getYOrN(String prompt) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			s = sc.nextLine();
			if (s.equalsIgnoreCase("")) {
				System.out.println("Error! Entry is required");
				continue;
			} else if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n")) {
				isValid = true;
			} else {
				System.out.println("Error! Only y or n is accepted.");
				continue;
			}

		}
		return s;
	}

	public static String getCOrE(String prompt) {
		String s = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.println(prompt);
			s = sc.nextLine();
			if (s.equalsIgnoreCase("")) {
				System.out.println("Error! Entry is required");
				continue;
			} else if (s.equalsIgnoreCase("c") || s.equalsIgnoreCase("e")) {
				isValid = true;
			} else {
				System.out.println("Error! Only c or e is accepted.");
				continue;
			}

		}
		return s;
	}

	public static void println(String string) {
		System.out.println(string);
		
	}

	public static void println() {
		System.out.println();
		
	}

}
