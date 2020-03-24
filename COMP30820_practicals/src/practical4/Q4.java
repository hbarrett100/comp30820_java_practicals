/*
 * A program to demonstrate stepwise refinement using method stubs.
 * In particular, the program determines whether or not a credit card number is valid.
 */

package practical4;

import java.util.Scanner;

public class Q4 {
	// main method
	public static void main(String[] args) {
		// Prompt the user to enter a credit card number
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a credit card number: ");
		String number = input.nextLine().trim();

		// Display result
		System.out.println(number + (isValidNumber(number) ? " is valid" : " is invalid"));

//		// Close the Scanner
		input.close();
	}

	// Return true if the card number is valid
	public static boolean isValidNumber(String number) {
		return (hasValidLength(number) && hasValidPrefix(number) && satisfiesMod10Check(number));

	}

	// Return true if the card number has between 13 and 16 digits
	public static boolean hasValidLength(String number) {
		return (number.length() <= 16 && number.length() >= 13);
	}

	// Return true if the card number has a valid prefix
	public static boolean hasValidPrefix(String number) {
		return number.startsWith("4") || number.startsWith("5") || number.startsWith("6") || number.startsWith("37");

	}

	// Return true if the Mod 10 check is satisfied
	public static boolean satisfiesMod10Check(String number) {
		return (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;

	}

	// Double every second digit from right to left and return sum
	public static int sumOfDoubleEvenPlace(String number) {
		int acc = 0;
		for (int i = number.length() - 2; i >= 0; i -= 2) {
			int num = ((int) number.charAt(i) - 48);
			acc += getSumDigits(2 * num);
		}
		return acc;
	}

	// Return sum of digits in odd places from right to left
	public static int sumOfOddPlace(String number) {
		int sum = 0;

		for (int i = number.length() - 1; i >= 0; i -= 2) {
			sum += (int) number.charAt(i) - 48;
		}
		return sum;
	}

	// Return this number if it is a single digit;
	// otherwise return the sum of the two digits
	public static int getSumDigits(int number) {
		return number / 10 + number % 10;

	}
}
