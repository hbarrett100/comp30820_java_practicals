// Method to test whether a number is a perfect number

package practical4;

public class Q2 {
	public static void main(String[] args) {

//		iterate over integers until first four perfect numbers are printed
//		initialize count and i to 0

		int count = 0;
		int i = 0;

//		while count is less than four
//		if i is a perfect number increment the count and print i
		while (count < 4) {
			i++;
			if (isPerfectNumber(i)) {
				count++;
				System.out.println(i);
			}
		}

	}

// function which returns true if number is a perfect number and false otherwise
	public static boolean isPerfectNumber(int number) {

//		if number is less than or equal to zero return false
		if (number <= 0)
			return false;

//		initialize sum to zero
//		if i divides evenly into the number then add it to the sum
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0)
				sum += i;
		}
//		return true if sum is equal to number, false otherwise
		return sum == number;

	}
}