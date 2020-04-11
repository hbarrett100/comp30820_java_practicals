//Write a test program that creates an Account object with an account id of 101, 
//a balance of $20,000, and set an annual interest rate of 0.045 (i.e. 4.5%). 
//Withdraw $2,500 from the account and deposit $3,000. 
//Display the balance, the monthly interest amount, and the date when the account was created.

package practical8;

public class TestAccount {
	public static void main(String[] args) {
		
		// create account
		Account acc1 = new Account(101, 20000);
		// set annualInterestRate
		Account.setAnnualInterestRate(0.045);
		// withdraw 
		acc1.withdraw(2500);
		// deposit
		acc1.deposit(3000);
		// display account
		System.out.printf("Balance: %.2f\n", acc1.getBalance());
		System.out.printf("Monthly Interest: %.2f\n", acc1.getMonthlyInterest());
		System.out.println("Date created: " + acc1.getDateCreated());
	}
}
