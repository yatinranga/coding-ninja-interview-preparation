package string_and_2d_array;

import java.util.Scanner;

/*
You are given a sentence contained in given string S. Write a function which will replace all the words within the sentence whose length is even
and greater than equal to 4, with a space between the two equal halves of the word.
Space complexity should be O(1).

Input Format :
String S
Output Format :
Updated string

Constraints :
1 <= Length of S <= 10000

Sample Input :
Helloo world good morniing

Sample Output :
Hel loo world go od morn iing
*/

public class BreakWords {

	public static String breakWords(String str) {

		String newString = "";

		String strArray[] = str.split(" ");

		for (int i = 0; i < strArray.length; i++) {

			String temp = strArray[i];

			if (temp.length() >= 4 && temp.length() % 2 == 0) {

				int half = temp.length() / 2;

				newString = newString + temp.substring(0, half) + " ";
				newString = newString + temp.substring(half) + " ";

			} else
				newString = newString + strArray[i] + " ";

		}

		return newString;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		System.out.println(breakWords(str));

	}

}
