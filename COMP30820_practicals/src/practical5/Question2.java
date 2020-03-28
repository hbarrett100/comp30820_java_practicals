
//Write method that returns true if an array of integers is sorted in ascending order.
//Also include a main method in your program. The main method should prompt the user to 
//enter the number of integers to be read, read the integers from the console, invoke the method isSorted, 
//and display a suitable message to the console (e.g. “is sorted” or “is not sorted”).

package practical5;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {

//		read the number of integers to be read
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of integers to be read");
		int number = input.nextInt();

//		read the intgers into a new array
		int[] nums = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.println("enter a number");
			int arrnum = input.nextInt();
			nums[i] = arrnum;
		}

//		display result
		System.out.print("the array is: " + (isSorted(nums) ? "sorted" : "not sorted"));

//		close the scanner
		input.close();
	}

//	method to sort the integers in ascending order
	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				return false;
		}
		return true;
	}
}
