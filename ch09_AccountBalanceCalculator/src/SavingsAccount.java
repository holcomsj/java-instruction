
public class SavingsAccount extends Account {
	private double interestRate;
	private double interestPayment;
	
	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestPayment() {
		return interestPayment;
	}

	public void setInterestPayment(double interestRate) {
		this.interestPayment = interestRate * super.getBalance();
	}
	
	
	
}
