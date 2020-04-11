// Method to find distinct lowercase letters in a char array. Method should return
// reference to a new char array containing the distinct lowercase letters in alphabetical order
//	No String or Character methods from the Java API to be used.

package practical7_exampleExam;

public class Q3b {
	public static void main(String[] args) {

		// Test case 1
		char[] c1 = {}; // i.e. an array with zero elements
		char[] d1 = getDistinctLCLetters(c1);
		System.out.println("test case 1:");
		printArray(c1); // should print: {}, i.e. an array with zero elements
		printArray(d1); // should print: {}, i.e. an array with zero elements
		System.out.println();

		// Test case 2
		char[] c2 = { 'B', 'E', 'E' };
		char[] d2 = getDistinctLCLetters(c2);
		System.out.println("test case 2:");
		printArray(c2); // should print: {B, E, E}
		printArray(d2); // should print: {}, i.e. an array with zero elements
		System.out.println();

		// Test case 3
		char[] c3 = { 'B', 'e', 'e' };
		char[] d3 = getDistinctLCLetters(c3);
		System.out.println("test case 3:");
		printArray(c3); // should print: {B, e, e}
		printArray(d3); // should print: {e}
		System.out.println();

		// Test case 4
		char[] c4 = { 'a', 'b', 'b', 'a' };
		char[] d4 = getDistinctLCLetters(c4);
		System.out.println("test case 4:");
		printArray(c4); // should print: {a, b, b, a}
		printArray(d4); // should print: {a, b}
		System.out.println();

	}

	// This method prints the values in arr
	public static void printArray(char[] arr) {
		System.out.print("{");

		for (int i = 0; i < arr.length - 1; i++)
			System.out.print(arr[i] + ", ");

		if (arr.length > 0)
			System.out.print(arr[arr.length - 1]);

		System.out.println("}");
	}

	// write this method
	public static char[] getDistinctLCLetters(char[] arr) {

//		create a boolean array with 26 characters to represent all lowercase letters
		boolean[] tempArr = new boolean[26];
		for (int i = 0; i < 26; i++) {
			char c = (char) ('a' + i);

//			if a character in the array is equal to c change its position in the boolean array to true
			for (char ch : arr) {
				if (ch == c) {
					tempArr[i] = true;
				}
			}
		}

//		if a value in the boolean array is true increment the counter
		int counter = 0;
		for (boolean b : tempArr) {
			if (b) {
				counter++;
			}
		}

//		create a new array with size equal to the counter
//		for each true value in boolean array add the corresponding letter to new array
		int idx = 0;
		char[] chars = new char[counter];
		for (int i = 0; i < tempArr.length - 1; i++) {
			if (tempArr[i]) {
				chars[idx] = (char) ('a' + i);
				idx++;
			}
		}

//		return the new array
		return chars;

	}
}