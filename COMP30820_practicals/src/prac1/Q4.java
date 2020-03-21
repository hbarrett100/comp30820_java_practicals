package Prac1;

import java.util.Scanner;
import java.lang.Math;

public class Q4 {

	public static void main(String[] args) {

		// prompt user to enter temperature in fahrenheit
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a temperature between -58 and 41");
		double temp = input.nextDouble();

		// prompt user to enter wind speed
		System.out.println("Enter a wind speed greater than or equal to 2");
		double windSpeed = input.nextDouble();

		// calculate windchill		
		double windChill = 35.74 + (0.6215 * temp) - 
				(35.75 * (Math.pow(windSpeed, 0.16)))
				+ (0.4275 * temp * (Math.pow(windSpeed, 0.16)));

		// output windchill results
		System.out.println("The wind chill temperature is: " + windChill);

		// close scanner
		input.close();
	}
}
