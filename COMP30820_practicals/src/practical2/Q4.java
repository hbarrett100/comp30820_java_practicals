package practical2;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {

//		prompt user to enter an integer
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 15: ");
		int num = input.nextInt();

//		check if number is valid
		if (num < 0 || num > 15)
			System.out.println("Invalid number");
		else {
			String hex = Integer.toHexString(num);
			
//			output hex number
			System.out.println("hex number is: " + hex);
		}
//		close scanner
		input.close();
	}
}