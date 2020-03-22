// program to create pattern

package practical3;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {

//		prompt user for a number
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int num = input.nextInt();

//		create pattern
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
//			print a new line
			System.out.println();
		}

//		close the scanner
		input.close();
	}
}