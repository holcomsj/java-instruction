import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TipCalcWithLoops {

	public static void main(String[] args) {

System.out.println("Welcome to the Tip Calculator");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Cost of Meal: ");
			double cost = sc.nextDouble();
			BigDecimal meal = new BigDecimal(cost);
			
			for(double r = .15; r <= .25; r += .05 ) {
				BigDecimal rate = new BigDecimal(r); 
				
				BigDecimal mealPercent = meal.multiply(rate).setScale(2, RoundingMode.HALF_UP);
				
				System.out.println(r*100+"%");
				System.out.println("Tip Amount:\t $" + mealPercent);
				System.out.println("Total Amount:\t $" + meal.add(mealPercent).setScale(2, RoundingMode.HALF_UP));
				System.out.println("\n");
				
			}
			System.out.println("Continue?(y/n)");
			choice = sc.next();
		}
		sc.close();
		System.out.println("BYE");
	}

}
