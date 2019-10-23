import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TipCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Tip Calculator");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter Price of meal: ");
			double price = sc.nextDouble();
			BigDecimal meal = new BigDecimal(price);
			
			final BigDecimal TIP_15 = new BigDecimal(".15");
			final BigDecimal TIP_20 = new BigDecimal(".2");
			final BigDecimal TIP_25 = new BigDecimal(".25");
			
			BigDecimal meal15Percent = meal.multiply(TIP_15).setScale(2, RoundingMode.HALF_UP);
			BigDecimal meal20Percent = meal.multiply(TIP_20).setScale(2, RoundingMode.HALF_UP);
			BigDecimal meal25Percent = meal.multiply(TIP_25).setScale(2, RoundingMode.HALF_UP);	
				
			System.out.println("15%");
			System.out.println("Tip Amount:\t $" + meal15Percent);
			System.out.println("Total Amount:\t $" + meal.add(meal15Percent).setScale(2, RoundingMode.HALF_UP));
			System.out.println("\n");
			
			System.out.println("20%");
			System.out.println("Tip Amount:\t $" + meal20Percent);
			System.out.println("Total Amount:\t $" + meal.add(meal20Percent).setScale(2, RoundingMode.HALF_UP));
			System.out.println("\n");
			
			System.out.println("25%");
			System.out.println("Tip Amount:\t $" + meal25Percent);
			System.out.println("Total Amount:\t $" + meal.add(meal25Percent).setScale(2, RoundingMode.HALF_UP));
			System.out.println("\n");
			
			
			System.out.println("Continue?(y/n)");
			choice = sc.next();
			}
			
			

		sc.close();
		System.out.println("Bye");	
		}}