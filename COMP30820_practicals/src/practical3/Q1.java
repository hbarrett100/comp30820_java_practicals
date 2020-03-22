package practical3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

//		prompt user to enter a string
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();

//		assign list of vowels
		String vowels = "aeiou";

//		initialise vowel and consonant counts to 0
		int vowel = 0;
		int consonant = 0;

//		convert string to lowercase
		String str = s.toLowerCase();

//		loop through new string and get character at each index
//		check if character is in the vowels string
//		if it is, increment the vowel count
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (vowels.indexOf(ch) >= 0)
				vowel++;
			else if (Character.isLetter(ch))
				consonant++;

		}

//		display results to user
		System.out.println("Number of vowels is: " + vowel);
		System.out.println("Number of consonants is: " + consonant);

//		close the scanner
		input.close();
	}
}