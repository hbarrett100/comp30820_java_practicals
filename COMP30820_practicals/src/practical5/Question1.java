// a program to compute the mean and standard deviation of set of n double values.

package practical5;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {

//		prompt the user to enter the amount of numbers to be read
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of values to be read: ");
		int n = input.nextInt();

//		create an empty array
		double[] nums = new double[n];

//		prompt the user to enter the numbers and add them to array
		for (int i = 0; i < n; i++) {
			System.out.print("Enter double value: ");
			double arrnum = input.nextDouble();
			nums[i] = arrnum;
		}

//		print out the mean and standard deviation
		System.out.println("The mean is: " + calcMean(nums));
		System.out.println("The standard deviation is: " + calcStdev(nums));

//		close the scanner
		input.close();
	}

//	create method to calculate the mean
	public static double calcMean(double[] arr) {
		double sum = 0;
		for (double num : arr)
			sum += num;
//		return the mean
		return sum / arr.length;

	}

//	create method to return the standard deviation
	public static double calcStdev(double[] arr) {
		double sumSquared = 0;
		for (double num : arr) {
			sumSquared += Math.pow(num - calcMean(arr), 2);

		}
//		return the standard deviation
		return Math.sqrt(sumSquared / (arr.length - 1));

	}
}