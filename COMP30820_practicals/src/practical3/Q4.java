package practical3;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {

//		prompt user for two strings so that common prefix can be found
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String s1 = input.nextLine();
		System.out.print("Enter second string: ");
		String s2 = input.nextLine();

//		create an empty substring
		String substr = " ";

//		iterate through strings and add common prefix to new string
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				char ch1 = s1.charAt(i);
				char ch2 = s2.charAt(j);
				if (ch1 - ch2 == 0)
					substr += ch1;
			}

		}

//		display the substring
		System.out.println(substr);

//		close the scanner
		input.close();

	}
}