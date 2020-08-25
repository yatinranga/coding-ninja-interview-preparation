package recursion;

import java.util.Scanner;

public class CheckPalindrome {

	static int increment = 0;
	static int decrement = 0;
	static boolean flag = true;
	static boolean result = false;

	public static boolean isStringPalindrome(String str) {

		if (flag) {
			decrement = str.length() - 1;
			flag = false;
		}

		if (str.length() == 1)
			return true;

		if (increment < decrement) {
			if (str.charAt(increment) == str.charAt(decrement)) {
				result = true;
				increment++;
				decrement--;
				isStringPalindrome(str);
			} else
				result = false;
		}

		return result;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		System.out.println(isStringPalindrome(str));
	}

}
