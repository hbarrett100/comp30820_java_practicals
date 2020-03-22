package practical3;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

//		prompt user to enter a string
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = input.nextLine();

//		create a new empty string
		String reverse = " ";

//		iterate through string backwards 
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse += s.charAt(i);
		}

//		print out the reversed string
		System.out.println(reverse);

//		close the scanner
		input.close();

	}
}
