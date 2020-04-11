package practical9;

public class SavingsAccount extends Account {

	// construct a default savings account
	public SavingsAccount() {
		super(); // invoke superclass constructor that takes no args
	}

	// create savings account with specified id and balance
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	// savings account cannot be overdrawn
	// if amount is greater than balance display error, else call super method
	@Override
	public void withdraw(double amount) {
		if (amount > getBalance())
			System.out.printf(
					"Your current balance is $%.2f. " + "You have attempted to withdraw $%.2f. "
							+ "This transaction cannot be completed. " + "Your balance is unchanged. ",
					getBalance(), amount);
		else
			super.withdraw(amount);

	}

}
