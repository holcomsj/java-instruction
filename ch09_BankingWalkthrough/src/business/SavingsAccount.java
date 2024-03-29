package business;

public class SavingsAccount extends Account {
	private double interestRate;
	private double interestPayment;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
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

	public void applyInterestPayment() {
		interestPayment = balance * interestRate;
		balance += interestPayment;
	}
	
	
	
	
	
}
