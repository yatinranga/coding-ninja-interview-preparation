package string_and_2d_array;

import java.util.HashSet;
import java.util.Scanner;

/*
Sample Input:
abcdabceb

Sample Output:
dabce
*/

public class LargestUniqueSubstring {

	public static String findLargestUniqueSubstring(String str) {

		int maxCount = 0;
		int i = 0;
		int j = 0;
		String temp = "";

		HashSet<Character> set = new HashSet<Character>();

		while (i < str.length() && j < str.length()) {
			if (!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;

				if (j - i > maxCount) {
					maxCount = j - i;
					temp = str.substring(i, j);
				}

			} else {
				for (int k = i; k <= j; k++) {
					if (str.charAt(k) == str.charAt(j)) {
						i = k + 1;
						set.remove(str.charAt(k));
						break;
					}

					else
						set.remove(str.charAt(k));
				}

			}

		}

		return temp;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();
		System.out.println(findLargestUniqueSubstring(str));

	}

}
