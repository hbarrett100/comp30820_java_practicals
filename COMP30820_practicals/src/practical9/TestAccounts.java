package practical9;

public class TestAccounts {
	public static void main (String[] args) {
		// Set the annual interest rate
		Account.setAnnualInterestRate(0.055);

		// Create a new SavingsAccount object with the specified id and balance
		SavingsAccount s = new SavingsAccount(1111, 2500.0);

		// Invoke the toString method
		System.out.println("Savings account: " + s.toString());

		// Withdraw $2,000 from the savings account and display the balance
		System.out.println("Savings account: withdraw $2,000...");
		s.withdraw(2000);
		System.out.println("Savings account balance: " + s.getBalance());
		
		// Withdraw a further $2,000 from the savings account and display the balance
		System.out.println("Savings account: withdraw a further $2,000...");
		s.withdraw(2000);
		System.out.println("Savings account balance: " + s.getBalance());

		// Get the monthly interest rate
		System.out.printf("Savings account monthly interest: %.2f\n", s.getMonthlyInterest());
		
		System.out.println("\n**************\n");

		// Create a new CheckingAccount object with the specified id and balance
		CheckingAccount c = new CheckingAccount(2222, 2500.0);

		// Invoke the toString method
		System.out.println("Checking account: " + c.toString());

		// Get the monthly interest rate
		System.out.printf("Checking account monthly interest: %.2f\n", c.getMonthlyInterest());

		// Withdraw $3,200 from the checking account and display the balance
		System.out.println("Checking account: withdraw $3,200...");
		c.withdraw(3200);
		System.out.println("Checking account balance: " + c.getBalance());

		// Withdraw a further $800 from the checking account and display the balance
		System.out.println("Checking account: withdraw a further $800...");
		c.withdraw(800);
		System.out.println("Checking account balance: " + c.getBalance());

		// Deposit $200 into the checking account, set the overdraft limit to $1,400, 
		// display the balance, try again to withdraw $800, and display the balance.
		System.out.println("Checking account: deposit $200...");
		c.deposit(200);
		System.out.println("Checking account: set the overdraft limit to $1,400...");
		c.setOverdraftLimit(1400);
		System.out.println("Checking account balance: " + c.getBalance());
		System.out.println("Checking account: withdraw $800...");
		c.withdraw(800);
		System.out.println("Checking account balance: " + c.getBalance());

		// Get the monthly interest rate
		System.out.println("Checking account monthly interest: " + c.getMonthlyInterest());
	}
}