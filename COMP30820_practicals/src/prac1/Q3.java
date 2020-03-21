package Prac1;

import java.util.Scanner;
import java.lang.Math;

public class Q3 {

	public static void main(String[] args) {

//		prompt user to enter first point with two double values
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x1 point:");
		double x1 = input.nextDouble();
		System.out.println("Enter x2 point:");
		double x2 = input.nextDouble();

//		prompt user to enter second point with two double values
		System.out.println("Enter y1 point:");
		double y1 = input.nextDouble();
		System.out.println("Enter y2 point:");
		double y2 = input.nextDouble();

//		calculate distance between points
		double distance = Math.sqrt(Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2);

//		output distance
		System.out.println("The distance is: " + distance);

//		close scanner
		input.close();
	}
}
