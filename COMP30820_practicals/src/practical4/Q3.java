// Method to test whether a string is a palindrome

package practical4;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {

//		create scanner
		Scanner input = new Scanner(System.in);

//		prompt user to enter a string
		System.out.print("Enter string: ");
		String s = input.nextLine();

//		print out whether or not the string is a palindrome
		System.out.println("\"" + s + "\"" + (isPalindrome(s) ? " is" : " is not") + " a palindrome");

		input.close();
	}

//	function which returns true if the string is a palindrome, false otherwise
	public static boolean isPalindrome(String str) {

		boolean isPalindrome = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
				isPalindrome = true;
			} else
				return isPalindrome;
		}

		return isPalindrome;

	}

}
