package hashmap;

import java.util.HashMap;
import java.util.Scanner;

/*
Given two random integer arrays, print their intersection. 
That is, print all the elements that are present in both the given arrays.
Input arrays can contain duplicate elements.

Note : Order of elements are not important

Input format :
Line 1 : Integer N, Array 1 Size
Line 2 : Array 1 elements (separated by space)
Line 3 : Integer M, Array 2 Size
Line 4 : Array 2 elements (separated by space)

Output format :
Print intersection elements in different lines

Constraints :
0 <= M, N <= 5 * 10^7

Sample Input 1 :
6
2 6 8 5 4 3
4
2 3 4 7 

Sample Output 1 :
2 
4 
3

Sample Input 2 :
4
2 6 1 2
5
1 2 3 4 2

Sample Output 2 :
2 
2
1
*/
public class PrintIntersection {

	public static void intersection(int[] arr1, int[] arr2) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : arr1) {

			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		for (int i : arr2) {

			if (map.containsKey(i) && map.get(i) >= 1) {
				System.out.println(i);
				map.put(i, map.get(i) - 1);
			}

		}

	}

	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);
		@SuppressWarnings("unused")
		int size1 = scan.nextInt();
		scan.nextLine();
		String str1 = scan.nextLine();

		String[] string1 = str1.split(" ");
		int arr1[] = new int[string1.length];
		for (int i = 0; i < string1.length; i++) {
			arr1[i] = Integer.parseInt(string1[i]);
		}

		@SuppressWarnings("unused")
		int size2 = scan.nextInt();
		scan.nextLine();
		String str2 = scan.nextLine();
		scan.close();

		String[] string2 = str2.split(" ");
		int arr2[] = new int[string2.length];
		for (int i = 0; i < string2.length; i++) {
			arr2[i] = Integer.parseInt(string2[i]);
		}

		intersection(arr1, arr2);

	}

}
