
public class CheckingAccount extends Account {
	private double monthlyFee;

	

	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.monthlyFee = monthlyFee;
	}

	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	public void balanceMinusFee() {
		super.setBalance(super.getBalance()- monthlyFee); 
	}
}
