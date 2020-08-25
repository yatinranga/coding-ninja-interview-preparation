package string_and_2d_array;

import java.util.Scanner;

/*
Sample Input:
Welcome to Coding Ninjas

Sample Output:
Ninjas Coding to Welcome
*/

public class ReverseStringWordWise {

	public static String reverseWordWise(String input) {

		String str[] = input.split(" ");

		String returnString = "";

		for (int i = str.length - 1; i >= 0; i--) {

			returnString = returnString + str[i] + " ";

		}

		return returnString;
	}

	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		str = reverseWordWise(str);

		System.out.println(str);

	}

}
