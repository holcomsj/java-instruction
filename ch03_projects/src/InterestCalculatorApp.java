import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {

		System.out.println("Welcome to the Interest Calculator");
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			System.out.println("Enter loan amount: ");
			double loan = sc.nextDouble();
			
			System.out.println("Enter interest rate: ");
			double interestRate = sc.nextDouble();
			
			NumberFormat loanCurrancy = NumberFormat.getCurrencyInstance();
			String loanString = loanCurrancy.format(loan);
			
			NumberFormat percent = NumberFormat.getPercentInstance();
			percent.setMaximumFractionDigits(3);
			String interestPercent = percent.format(interestRate);
			
			BigDecimal loanSubtotal = new BigDecimal(loanString);
			BigDecimal rateSubtotal = new BigDecimal(interestRate);
			
			BigDecimal interestTotal = loanSubtotal.divide(rateSubtotal, 3, RoundingMode.HALF_UP);
			NumberFormat currancy = NumberFormat.getCurrencyInstance();
			String loanTotal = currancy.format(interestTotal);
;			
			
			
			System.out.println("Loan amount:    " + loanString);
			System.out.println("Interest rate:  " + interestPercent);
			System.out.println("Interest Total: " + loanTotal);
			
			System.out.println("Continue?(y/n)");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye");
	}

}
