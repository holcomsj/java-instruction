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
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDoubleWithinRange(String prompt,
            double min, double max) {
        double d = 0.0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
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
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getIntWithinRange(String prompt,
            int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(prompt);
            if (i <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (i >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return i;
    }
    
    public static String getString(String prompt) {
    	System.out.print(prompt);
    	String s = sc.next();
    	sc.nextLine();
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
				continue;}

}
		 return s;}
		
	}
