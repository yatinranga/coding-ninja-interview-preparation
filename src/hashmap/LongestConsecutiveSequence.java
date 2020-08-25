package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
You are given with an array of integers that contain numbers in random order. 
Write a program to find the longest possible sequence of consecutive numbers using the numbers from given array.
You need to return the output array which contains consecutive elements. Order of elements in the output is not important.

Best solution takes O(n) time.

If two sequences are of equal length then return the sequence starting with the number whose occurrence is earlier in the array.

Input Format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)

Constraints :
0 <= n <= 10^8

Sample Input 1 :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
Sample Output 1 :
8 
9 
10 
11 
12

Sample Input 2 :
7
3 7 2 1 9 8 1
Sample Output 2 :
7
8
9

Explanation: Sequence should be of consecutive numbers. Here we have 2 sequences with same length i.e. [1, 2, 3] and [7, 8, 9], but output should be [7, 8, 9] because the starting point of [7, 8, 9] comes first in input array.

Sample Input 3 :
7
15 24 23 12 19 11 16
Sample Output 3 :
15 
16
*/
//
public class LongestConsecutiveSequence {

	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {

		int finalStart = 0;
		int finalLength = 0;
		int arrayIndexValue = 0;

		ArrayList<Integer> finalList = new ArrayList<Integer>();
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		for (int i : arr) {
			if (map.containsKey(i) && map.get(i).equals(true)) {
				continue;
			} else {
				map.put(i, true);
			}
		}

		for (int i : arr) {

			int length = 0;
			int start = 0;

			if (map.containsKey(i) && map.get(i).equals(true)) {

				length++;
				map.put(i, false);
				start = i;

				int next = i + 1;

				while (map.containsKey(next) && map.get(next).equals(true)) {
					length++;
					map.put(next, false);
					++next;
				}

				int previous = i - 1;

				while (map.containsKey(previous) && map.get(previous).equals(true)) {
					length++;
					start = previous;
					map.put(previous, false);
					--previous;

				}

			} else {
				continue;
			}

			if (length > finalLength) {
				finalLength = length;
				finalStart = start;
				arrayIndexValue = i;

			}

			if (length == finalLength) {

				if (!(finalStart == arrayIndexValue)) {
					finalLength = length;
					finalStart = start;
					arrayIndexValue = i;
				}

			}
		}

		while (finalLength-- > 0) {
			finalList.add(finalStart++);

		}

		return finalList;

	}

	public String checker(String Test_String, String Regex_Pattern) {

		Pattern p = Pattern.compile(Regex_Pattern);
		Matcher m = p.matcher(Test_String);
		while (m.find()) {

			/*
			 * you can ignore the print statements below it it just telling the start and
			 * end index of the pattern you're searching in string
			 */

			System.out.print("Start index: " + m.start());
			System.out.print(" End index: " + m.end());
			System.out.println(" Found: " + m.group());

			/*
			 * replaceFirst just replace the first occurance of the pattern use replaceAll
			 * just in case you want to replace all the occurances of the pattern in string
			 */
			Test_String = Test_String.replaceFirst(Regex_Pattern, "");
			break;
		}
		return Test_String;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		ArrayList<Integer> finalList = new ArrayList<Integer>();

		scan.nextLine();
		String str = scan.nextLine();
		scan.close();

		String stringArray[] = str.split(" ");
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(stringArray[i]);
		}

		finalList = longestConsecutiveIncreasingSequence(arr);

		for (int i : finalList) {
			System.out.println(i);

		}

	}

}
