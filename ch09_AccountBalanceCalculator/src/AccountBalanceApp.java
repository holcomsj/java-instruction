
public class AccountBalanceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the PseudoBanking App");
		
		Account checking = new CheckingAccount();
		Account savings = new SavingsAccount();
		
		System.out.println("Starting Balance:");
		System.out.println("Checking: " + checking.getBalance());
		System.out.println("Savings: " + savings.getBalance());
		
		System.out.println("Enter a transaction for the month");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("Y")) {
			String action = Console.getString("Withdraw or deposit?(w/d)");
			String account = Console.getString("Checking or Savings?(c/s)");
			double amount = Console.getDouble("Amount?:" );
			
			
		}
		
		
		
		
		System.out.println("Thanks for using this product");
		
		
		

	}

}
