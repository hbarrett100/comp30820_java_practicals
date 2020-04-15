package practical10;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);

		// Prompt the user to create a savings or a checking account
		//*** Start #1 ***//
		int type = 0;
		do {
			System.out.println("What kind of account do you wish to create?");
			System.out.print("Enter 1 for savings and 2 for checking: ");
			type = input.nextInt();
		}
		while (type != 1 && type != 2);

		Account account;
		if (type == 1) account = new SavingsAccount();
		else account = new CheckingAccount();

		// Prompt the user to enter the account id, balance, and annual interest rate
		System.out.print("\nEnter the account id (int): ");
		int id = input.nextInt();
		account.setId(id);

		System.out.print("Enter the account balance (double): ");
		double balance = input.nextDouble();
		account.setBalance(balance);

		System.out.print("Enter the annual interest rate (double): ");
		double annualInterestRate = input.nextDouble();
		Account.setAnnualInterestRate(annualInterestRate);
		//*** End #1 ***//
		
		do {
			// Display options to users
			//*** Start #2 ***//
			displayOptions(account);

			int option = input.nextInt();
			if (option == 0)
				break; 

			switch (option) {
			case 1: 
				System.out.println("\n\tThe id is: " + account.getId());
				System.out.println("\tThe account was created on: " + account.getDateCreated());
				break;
			case 2:
				System.out.printf("\n\tThe balance is: %.2f\n", account.getBalance());
				break;
			case 3:
				System.out.printf("\n\tThe monthly interest is: %.2f\n", account.getMonthlyInterest());
				break;
			case 4:
				System.out.print("\n\tEnter the amount to withdraw: ");
				double withdrawAmount = input.nextDouble();
				account.withdraw(withdrawAmount);
				break;
			case 5:
				System.out.print("\n\tEnter the amount to deposit: ");
				double depositAmount = input.nextDouble();
				account.deposit(depositAmount);
				break;	
			case 6:
				if (account instanceof CheckingAccount)
					System.out.printf("\n\tThe overdraft limit is: %.2f\n", ((CheckingAccount)account).getOverdraftLimit());
				else
					System.out.println("\n\tOption not available");
				break;
			case 7:
				if (account instanceof CheckingAccount) {
					System.out.print("\n\tEnter the new  overdraft limit: ");
					double limit = input.nextDouble();
					((CheckingAccount)account).setOverdraftLimit(limit);
				} else
					System.out.println("\n\tOption not available");
				break;	
			default: 
				System.out.println("\n\tInvalid option. Try again.");
			//*** End #2 ***//
			};
		} while (true);

		// Display a final message
		System.out.println("\nGoodbye");

		// Close the Scanner
		input.close();
	}

	// Display the user options
	public static void displayOptions(Account account) {
		System.out.println("\nOptions:");
		System.out.println("1. Display account details");
		System.out.println("2. Display account balance");
		System.out.println("3. Display monthly interest");
		System.out.println("4. Make a withdrawal");
		System.out.println("5. Make a deposit");

		if (account instanceof CheckingAccount) {
			System.out.println("6. Display overdraft limit");
			System.out.println("7. Change overdraft limit");
		}
		
		System.out.println("0. To exit");
		System.out.print("Select an option (int): ");
	}
}
