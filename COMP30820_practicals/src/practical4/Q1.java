// Method to test whether a number is prime

package practical4;

public class Q1 {
	public static void main(String[] args) {

//		iterate over integers starting from 0 and print first 10 prime numbers
//		initalise count and i to zero

		int count = 0;
		int i = 0;

//		if number is prime print it and increment count by 1
		while (count < 10) {
			i++;
			if (isPrime(i)) {
				count++;
				System.out.println(i);
			}
		}
	}

//	function which returns true is number is prime and false otherwise
	public static boolean isPrime(int number) {

//		if number is less than 1 return false
		if (number <= 1)
			return false;
		else
//			if number has divisor then it is not prime
			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					return false;
				}
			}
//		number is prime
		return true;

	}

}
