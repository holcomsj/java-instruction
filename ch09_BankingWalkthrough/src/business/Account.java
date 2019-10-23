package business;

public class Account implements Depositable, Withdrawlable, Balancable {

	protected double balance;

	public Account() {
		super();
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;

	}

	@Override
	public void withdrawl(double amount) {
		balance -= amount;

	}

	@Override
	public void deposit(double amount) {
		balance += amount;

	}

}
