
package Prac1;

import java.util.Scanner;
import java.lang.Math;


public class Q1 {

	public static void main(String[] args) {
		
		// prompt user to enter radius
		Scanner input = new Scanner(System.in);
		System.out.println("enter radius:");
		double radius = input.nextDouble();
		
		// prompt user to enter length
		System.out.println("enter length:");
		double length = input.nextDouble();
		
		// perform calculations
		double area = Math.pow(radius, 2)*Math.PI;
		double volume = area*length;
		
		// print out result
		System.out.println("The area is: " + area);
		System.out.println("The volume is: " +  volume);
		
		
		// close the input
		input.close();
	}
}
