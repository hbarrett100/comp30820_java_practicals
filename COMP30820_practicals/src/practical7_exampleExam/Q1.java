// A method to replace every occurrence of a given character in a string. 
// The first occurrence is replaced with 1, the second with 2 etc. 

package practical7_exampleExam;

public class Q1 {
	public static void main(String[] args) {
		// test cases

		// Should print: "M1ss2ss3pp4"
		System.out.println("test case 1: " + replace("Mississippi", 'i'));

		// Should print: "Hello World"
		System.out.println("test case 2: " + replace("Hello World", 'w'));

		// Should print: "1134"
		System.out.println("test case 3: " + replace("1234", '2'));
	}

	// write this method
	public static String replace(String str, char ch) {
		char count = '0';
		String newString = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				newString += str.charAt(i);
			} else {
				count++;
				newString += count;
			}

		}
		return newString;

	}
}
