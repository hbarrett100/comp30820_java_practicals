package practical3;

import java.util.Scanner;

public class Q4b {
	public static void main(String[] args) {

//		prompt user for two strings
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String s1 = input.nextLine();
		System.out.print("Enter second string: ");
		String s2 = input.nextLine();

//		iterate through the strings to the length of the shortest string
		int min = Math.min(s1.length(), s2.length());
		for (int i = 0; i < min; i++) {

//			if the characters are not the same print out the substring up to this point
			if (s1.charAt(i) != s2.charAt(i)) {
				System.out.println(s1.substring(0, i));
			}
		}

//	 	print substring
		System.out.println(s1.substring(0, min));

//		close the scanner
		input.close();
	}
}