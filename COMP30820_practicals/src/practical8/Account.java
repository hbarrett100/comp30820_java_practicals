// A class to represent a bank account.

package practical8;

import java.util.Date;

public class Account {
	private int id; // id for an account
	private double balance; // balance for an account
	private Date dateCreated; // The date of creation
	private static double annualInterestRate = 0; // current interest rate

	// create account with default values
	public Account() {
		this(0, 0);
	}

	// create account with specified id and balance
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	// get account id
	public int getId() {
		return id;
	}

	// get balance
	public double getBalance() {
		return balance;
	}

	// get annual interest rate
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// set id
	public void setId(int id) {
		this.id = id;
	}

	// set balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// set annual interest rate
	public static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	// get date created
	public Date getDateCreated() {
		return dateCreated;
	}


	// get monthly interest
	public double getMonthlyInterest() {
		return balance * annualInterestRate / 12;
	}

	// withdraw money from account
	public void withdraw(double amount) {
		this.balance -= amount;
	}

	// deposit money into account
	public void deposit(double amount) {
		this.balance += amount;
	}

	// string representation of account
	@Override
	public String toString() {
		return "Account id: " + id + "\nBalance: " + balance + "\nDate created: " + dateCreated;
	}

}
