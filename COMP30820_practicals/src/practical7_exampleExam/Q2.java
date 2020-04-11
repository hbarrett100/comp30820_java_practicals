// Method to check if string two is contained in string one

package practical7_exampleExam;

public class Q2 {
	public static void main(String[] args) {
		// test cases

		// Should print: true
		System.out.println("test case 1: " + contains("be", "be"));

		// Should print: false
		System.out.println("test case 2: " + contains("b", "be"));

		// Should print: false
		System.out.println("test case 3: " + contains("1234", "45"));

		// Should print: true
		System.out.println("test case 4: " + contains("sheep", "he"));
	}

	// write this method
	public static boolean contains(String s1, String s2) {
//		if either string is empty return false
		if (s1.length() == 0 || s2.length() == 0) {
			return false;

//		if s2 is bigger than s1 return false
		} else if (s2.length() > s1.length()) {
			return false;

//		if the strings are of equal length return false if they do not contain all characters the same
//		return true otherwise
		} else if (s2.length() == s1.length()) {
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					return false;
				}
			}
			return true;

//		return true if s2 is equal to a substring within s1. false otherwise
		} else {
			for (int i = 0; i < s1.length() - s2.length(); i++) {
				if (s2.equals(s1.substring(i, i + s2.length()))) {
					return true;
				}
			}
			return false;

		}
	}
}