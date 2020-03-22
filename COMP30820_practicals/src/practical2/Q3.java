package practical2;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {

//		prompt user to enter coordinates
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the x coordinate: ");
		double x = input.nextDouble();
		
		System.out.println("Enter the y coordinate: ");
		double y = input.nextDouble();

//		check if point is inside, on edge or outside triangle
		if (Math.abs(x) < 5 && Math.abs(y) < 2.5)
			System.out.println("Point is inside rectangle");
		else if (Math.abs(x) == 5 && Math.abs(y) == 2.5)
			System.out.println("Point is on edge of rectangle");
		else
			System.out.println("Point is on outside of rectangle");

//		close scanner
		input.close();
	}
}