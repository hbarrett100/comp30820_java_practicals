package practical3;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {

//		prompt user for string
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");

//		read string
		String s = input.nextLine();

//		create a new empty string
		String newstr = " ";
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

//			if character in string is lower case increment it by 1
//			or if z convert to a
			if (Character.isLowerCase(ch)) {
				if (ch == 'z')
					newstr += 'a';
				else
					newstr += (char) (ch + 1);
			} else
				newstr += ch;
		}

//		output result
		System.out.println(newstr);

//		close scanner	
		input.close();
	}

}
