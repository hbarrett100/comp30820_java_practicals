//
//Then, create a copy of the ATM class and modify it as follows:
//(i) Movethecodebetween//*** Start #1 ***//and//*** End #1 ***//fromthemainmethod
//to a static method in the modified ATM class.
//(ii) Movethecodebetween//*** Start #2 ***//and//*** End #2 ***//fromthemainmethod to a static method in the modified ATM class.
//

package practical10;

import java.util.Scanner;

public class ATM_modified {

	public static void main(String[] args) {
		// Create an instance of the Scanner class
		Scanner input = new Scanner(System.in);

		// *** Start #1 ***//
		Account account = createAccount(input);
		// *** End #1 ***//

		do {
			// Display options to users
			// *** Start #2 ***//
			if (!processOptions(input, account))
				break;
			// *** End #2 ***//

		} while (true);

		// Display a final message
		System.out.println("\nGoodbye");

		// Close the Scanner
		input.close();

	}

	// Prompt the user to create a savings or a checking account
	public static Account createAccount(Scanner input) {
		int type = 0;
		do {
			System.out.println("What kind of account do you wish to create?");
			System.out.print("Enter 1 for savings and 2 for checking: ");
			type = input.nextInt();
		} while (type != 1 && type != 2);

		Account account;
		if (type == 1)
			account = new SavingsAccount();
		else
			account = new CheckingAccount();

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

		return account;
	}

	//process the options chosen by the user
	public static boolean processOptions(Scanner input, Account account) {
		displayOptions(account);

		int option = input.nextInt();
		if (option == 0)
			return false;

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
				System.out.printf("\n\tThe overdraft limit is: %.2f\n",
						((CheckingAccount) account).getOverdraftLimit());
			else
				System.out.println("\n\tOption not available");
			break;
		case 7:
			if (account instanceof CheckingAccount) {
				System.out.print("\n\tEnter the new  overdraft limit: ");
				double limit = input.nextDouble();
				((CheckingAccount) account).setOverdraftLimit(limit);
			} else
				System.out.println("\n\tOption not available");
			break;
		default:
			System.out.println("\n\tInvalid option. Try again.");

		};
		
		return true;
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
