package hashmap;

import java.util.HashMap;
import java.util.Scanner;

/*
Make Strings Anagram

Given two strings S1 and S2, 
find and return the minimum number of deletions to be made (total count of deletions in both strings) in order to make the strings anagram.

Anagram of a string is a string which is its permutation.

For example "bbaa" and "abab" are anagrams of each other but "bbaa" and "aaab" are not.

Input Format :
Line 1 : String1
Line 2 : String2
Output Format :
Number of deletions required

Contraints :
1<= Length of string <=10^4

Sample Input 1 :
cde 
abc
Sample Output 1 :
4

Sample Input 2 :
aab
aba
Sample Output 2 :
0
*/
public class MakeStringsAnagram {

	public static int makeAnagram(String s1, String s2) {

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {

			Character c = s1.charAt(i);

			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c) + 1);
			} else {
				map1.put(c, 1);
			}

		}

		for (int i = 0; i < s2.length(); i++) {

			Character c = s2.charAt(i);

			if (map1.containsKey(c) && map1.get(c) > 0) {
				map1.put(c, map1.get(c) - 1);
			} else {
				count++;
			}
		}

		for (int i = 0; i < s1.length(); i++) {

			Character c = s1.charAt(i);

			if (map1.get(c) > 0) {
				count += map1.get(c);
				map1.put(c, 0);
			} else
				continue;
		}

		return count;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		scan.close();

		System.out.println(makeAnagram(s1, s2));

	}

}
