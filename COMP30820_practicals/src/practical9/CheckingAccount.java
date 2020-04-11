package practical9;

public class CheckingAccount extends Account {
	private double overdraftLimit; //new instance variable 

	// construct default checking account
	public CheckingAccount() {
		this(0, 0);
	}

	// construct checking account with specific id, balance
	public CheckingAccount(int id, double balance) {
		super(id, balance);
		this.overdraftLimit = 1000;
	}

	// get overdraft limit
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	// set the overdraft limit
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	// override super method to print details of account
	@Override
	public String toString() {
		return super.toString() + " Overdraft limit: " + getOverdraftLimit();

	}

	// if amount to withdraw is greater than limit display message, else call super
	// method
	@Override
	public void withdraw(double amount) {
		if ((getBalance() - amount) < -1 * this.overdraftLimit) {
			System.out.printf("Your current balance is: $%.2f. " + "Your overdraft limit is $%.2f. "
					+ "You have attempted to withdraw $%.2f" + "This transaction cannot be completed. "
					+ "Your balance is unchanged.", getBalance(), this.overdraftLimit, amount);
		} else {
			super.withdraw(amount);
		}

	}

	// Return the monthly interest amount
	@Override
	public double getMonthlyInterest() {
		if (getBalance() < 0) {
			return 0;
		} else
			return super.getMonthlyInterest();
	}
}
