package practical2;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int input_year = input.nextInt();
		int year = input_year % 12;
		switch(year) {
		case 0:
			System.out.println("Monkey");
			break;
		case 1:
			System.out.println("Rooster");
			break;
		case 2:
			System.out.println("dog");
			break;
		case 3:
			System.out.println("pig");
			break;
		case 4:
			System.out.println("rat");
			break;
		case 5:
			System.out.println("ox");
			break;
		case 6:
			System.out.println("tiger");
			break;
		case 7:
			System.out.println("rabbit");
			break;
		case 8:
			System.out.println("dragon");
			break;
		case 9:
			System.out.println("snake");
			break;
		case 10:
			System.out.println("horse");
			break;
		case 11:
			System.out.println("sheep");
			break;
			

		}
		input.close();
	}
}
