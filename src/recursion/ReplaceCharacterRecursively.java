package recursion;

import java.util.Scanner;

public class ReplaceCharacterRecursively {

	public static String replaceCharacter(String str, char c1, char c2) {

		if (str.length() == 0)
			return str;

		String finalString = "";
		if (str.charAt(0) == c1) {
			finalString = finalString + c2;
		} else
			finalString = finalString + str.charAt(0);

		String ans = replaceCharacter(str.substring(1), c1, c2);

		return finalString + ans;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		char c1 = scan.next().charAt(0);
		char c2 = scan.next().charAt(0);

		System.out.println(replaceCharacter(str, c1, c2));
	}

}
