package Prac1;

import java.util.Scanner;
import java.lang.Math;


public class Q5 {

	public static void main(String[] args) {

//		prompt user to enter distance in miles
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance to drive in miles:");
		double miles = input.nextDouble();

//		read miles per gallon
		System.out.println("Enter the fuel efficiency of the car in distance per miles:");
		double efficiency = input.nextDouble();

//		read price per gallon
		System.out.println("Enter the price per gallon: ");
		double price = input.nextDouble();

//		perform calculations
		double cost = miles / efficiency * price;

//		output results
		System.out.println("The cost of the trip is: " + cost);

//		close scanner
		input.close();

	}
}