import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
	//Hello
	System.out.println("Welcome to the Temperature Converter\n");
	
	String choice = "y";
		
	//Input
	Scanner sc = new Scanner(System.in);
		
	while (choice.equalsIgnoreCase("y")) {
		System.out.println("Enter degrees in Fahrenheit");
		double tempF = sc.nextDouble();
		
		double tempC = (double)(tempF - 32) * 5/9;
		double roundedTempC = Math.round(tempC * 100)/100;
		
		System.out.println("Temperature in Celcius: " + roundedTempC);
		
		System.out.println("Continue?(y/n)");
		choice = sc.next();
	}

		
		
		
	//Display output
		
	
		
	//Continue
		
		
		
	//Bye
	System.out.println("Bye!");
	}

}
