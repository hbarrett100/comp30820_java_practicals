// An n×n matrix (i.e. a 2-D table with n rows and n columns) is called a positive Markov matrix
// if each element is positive and the sum of the elements in each column is 1. 
// Write a method to check whether a matrix is a Markov matrix.

package practical6;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		//prompt user to enter the value of n
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();

		// populate the matrix with random numbers
		double[][] matrix = createArray(n);
		
		//display the array
		displayArray(matrix);
		
		// display results
		System.out.println("The matrix is " + (isMarkovMatrix(matrix) ? "a markov matrix" : "not a markov matrix"));
		
		//  close the scanner
		input.close();
	}

	//create 2d array
	public static double[][] createArray(int n) {
		double matrix[][] = new double[n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = Math.random();
			}
		}
		
		//return the array
		return matrix;
	}
	
	public static boolean isMarkovMatrix(double[][] m) {

		// check that each element in the matrix is positive
		boolean positiveNums = true;
		for (int row = 0; row < m.length; row++) {
			for (int col = 0; col < m[row].length; col++) {
				if (m[row][col] < 0)
					positiveNums = false;
			}
		}
		// add the elements in each column
		int i;
		int j;
		boolean sumOne = true;
		for (i = 0; i < m[0].length; i++) {
			double sumCol = 0;
			for (j = 0; j < m.length; j++) {
				sumCol += m[j][i];

			}
			// if the sum of column is not 1 then return false
			if (sumCol != 1)
				sumOne = false;
		}
		// return a boolean value
		return positiveNums && sumOne;
	}
	
	// display the array
	public static void displayArray(double[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++)
				System.out.printf("%.3f ", arr[i][j]);
			System.out.println();
		}
	}

}
