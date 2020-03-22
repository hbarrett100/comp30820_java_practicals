package practical2;

import Practical2.Scanner;

public class Q5 {

	public static void main(String[] args) {

//		prompt user for input 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char ch = input.next().charAt(0);

//		check if letter is either upper or lower case letter
		if (Character.isLowerCase(ch) || Character.isUpperCase(ch)) {

//			convert all to lower case
//			check if character is a vowel or consonant
			char lower = Character.toLowerCase(ch);
			boolean isvowel = lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';

			System.out.println("the character is: " + (isvowel ? "vowel" : "consonant"));
		} else
			System.out.println("You must enter a letter");

//		close scanner
		input.close();
	}

}