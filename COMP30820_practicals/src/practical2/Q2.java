package practical2;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {

//		prompt user for radius
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = input.nextDouble();

//		check radius is greater than zero
		if (radius <= 0)
			System.out.println("You must enter a number greater than 0");
		else {

			double s = 2 * radius * Math.sin(Math.PI / 5);

			double area = (5 * Math.pow(s, 2)) / 4 * Math.tan(Math.PI / 5);

//			output area
			System.out.println("the area is: " + area);

//		close scanner	
			input.close();
		}
	}
}