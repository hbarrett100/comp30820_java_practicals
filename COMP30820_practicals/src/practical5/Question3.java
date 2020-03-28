// Write a method that tests whether an integer array contains (at least one instance of) 
//four consecutive integers with the same value.
// Include a main method in your program. The main method should prompt the user to enter the number of integers to be read,
// read the integers from the console, invoke the method isConsecutiveFour, and display a suitable message
//to the console (e.g. "contains four consecutive integers" or "does not contain four consecutive integers").

package practical5;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

//		ask user to enter number of integers to be read
		Scanner input = new Scanner(System.in);
		System.out.println("enter number of integers to be read");
		int arrsize = input.nextInt();

//		read the integers into a new array
		int[] nums = new int[arrsize];
		for (int i = 0; i < arrsize; i++) {
			System.out.println("Enter a number");
			int n = input.nextInt();
			nums[i] = n;
		}
//		display result
		System.out.println("The array " + (isConsecutiveFour(nums) ? "contains four consecutive numbers"
				: "does not contain four consecutive numbers"));

//		close the scanner
		input.close();
	}

//	returns true if there are four consecutive numbers, false otherwise
	public static boolean isConsecutiveFour(int[] arr) {
		int temp = arr[0];
		if (arr.length < 4)
			return false;
		else
			for (int i = 1; i < arr.length - 1; i++) {
				if (arr[i] != temp)
					return false;
			}
		return true;
	}

}
