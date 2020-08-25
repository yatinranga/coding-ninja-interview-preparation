package recursion;

import java.util.Scanner;
/*
Given a string S, remove consecutive duplicates from it recursively.

Input Format :
String S
Output Format :
Output string

Constraints :
1 <= Length of String S <= 10^3

Sample Input :
aabccba
Sample Output :
abcba
*/

public class RemoveDuplicatesRecursively {

	public static String removeConsecutiveDuplicates(String str) {

		if (str.length() == 0 || str.length() == 1)
			return str;

		String finalString = "";
		String ans = "";

		if (str.charAt(0) == str.charAt(1)) {
			finalString = finalString + str.charAt(1);
		} else {
			finalString = finalString + str.charAt(0);
		}

		ans = removeConsecutiveDuplicates(str.substring(1));

		if (ans.length() != 0) {
			if (finalString.charAt(finalString.length() - 1) == ans.charAt(0))
				return ans;
		}

		return finalString + ans;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(removeConsecutiveDuplicates(scan.nextLine()));
		scan.close();
	}

}
