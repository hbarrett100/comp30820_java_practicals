// Program to create pattern

package practical3;

import java.util.Scanner;

public class Q5c {
	public static void main(String[] args) {

//		prompt user for a number
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number");
		int num = input.nextInt();

//		create pattern
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

//		close the scanner
		input.close();
	}
}