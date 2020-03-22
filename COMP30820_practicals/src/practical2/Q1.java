package practical2;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {

//		prompt user to enter lengths of triangle sides
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the lengths of the three sides of the triangle: ");

//		read numbers
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

//		if sum of two sides is greater than length of remaining side
//		calculate perimeter	
		if (num1 + num2 > num3 && num2 + num3 > num1 && num3 + num1 > num2) {
			double perimeter = num1 + num2 + num3;
			System.out.println("the perimeter is: " + perimeter);
		} else {
			System.out.println("Invalid input");
		}

//		close scanner
		input.close();

	}
}