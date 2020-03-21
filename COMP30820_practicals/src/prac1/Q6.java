package Prac1;

import java.util.Scanner;
import java.lang.Math;

public class Q6 {

	public static void main(String[] args) {

//		prompt user to enter a number between 0 and 99
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 99");
		int number = input.nextInt();

//		check number is within expected range
//		do calculations if number is valid
		if (number < 0 || number > 999)
			System.out.println("Number is not between 0 and 999");
		else {
			int second = number / 10;
			int secondDigit = second % 10;
			int firstDigit = second / 10;
			int thirdDigit = number % 10;
			int sum = firstDigit + secondDigit + thirdDigit;
			
//			print out results
			System.out.println("the sum is: " + sum);
		}
		
//		close scanner
		input.close();
	}
}