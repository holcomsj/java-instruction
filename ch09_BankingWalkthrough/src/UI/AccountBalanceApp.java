package UI;

import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import util.Console;


public class AccountBalanceApp {
	static NumberFormat cf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		System.out.println("Welcome");
		CheckingAccount ca = new CheckingAccount(1000.00, 1.0);
		SavingsAccount sa = new SavingsAccount(1000, .01);

		System.out.println("Starting Balances");
		displayBalances(ca, sa);
		System.out.println("Enter transactions for the month:");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// get inputs
			String txn = Console.getString("Withdraw or Deposit?");
			String acct = Console.getString("Checkings or Savings");
			Double amount = Console.getDoubleWithinRange("Amount?", 0, Double.POSITIVE_INFINITY);

			Account a = null;
			if (acct.equalsIgnoreCase("c")) {
				a = ca;
			} else if (acct.equalsIgnoreCase("s")) {
				a = sa;
			} else {
				System.out.println("Invalid account type");
				continue;
			}

			if (txn.equalsIgnoreCase("w")) {
				a.withdrawl(amount);
			} else if (txn.equalsIgnoreCase("d")) {
				a.deposit(amount);

			} else {
				System.out.println("Invalid txn.");
				continue;
			}
			
			choice = Console.getString("Continue?");
		}
		// calculate monthly fees
		ca.subtractFeeFromBal();
		sa.applyInterestPayment();

		// display balances, payments, fees
		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking Fee: " + cf.format(ca.getMonthlyFee()));
		System.out.println("Savings Interest Payment: " + cf.format(sa.getInterestPayment()));

		displayBalances(ca, sa);

		System.out.println("Bye");
	}

	private static void displayBalances(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking: " + cf.format(ca.getBalance()));
		System.out.println("Savings: " + cf.format(sa.getBalance()));
	}
}
