// Program to create pattern
package practical3;

import java.util.Scanner;

public class Q5b {
	public static void main(String[] args) {

//		prompt user for a number
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int num = input.nextInt();

//		create pattern
		for (int i = num; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

//		close the scanner
		input.close();

	}
}