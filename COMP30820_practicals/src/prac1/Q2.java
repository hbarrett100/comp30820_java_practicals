package Prac1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
//		prompt user to enter number of years
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of years: ");
		int years = input.nextInt();
		
//		do calculations
		double yearsInSec = years*24*60*60;
		double birth = yearsInSec/7.0;
		double death = yearsInSec/14.0;
		double immigration = yearsInSec/45.0;
		double population = 312032486 + years*(birth + immigration - death);
		
//		display population
		System.out.println("The population is:" + population);
		
//			close the scanner
		input.close();
	}
}
