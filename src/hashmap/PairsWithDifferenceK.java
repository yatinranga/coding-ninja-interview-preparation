package hashmap;

import java.util.HashMap;
import java.util.Scanner;

/*
You are given with an array of integers and an integer K. Write a program to find and print all pairs which have difference K.
Take difference as absolute.

Input Format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
Line 3 : K
Output format :
Print pairs in different lines (pair elements separated by space). In a pair, smaller element should be printed first.
(Order of different pairs is not important)

Constraints :
0 <= n <= 10^4

Sample Input 1 :
4 
5 1 2 4
3
Sample Output 1 :
2 5
1 4

Sample Input 2 :
4
4 4 4 4 
0
Sample Output 2 :
4 4
4 4
4 4
4 4
4 4
4 4
*/

public class PairsWithDifferenceK {

	public static void findPairsDifferenceK(int[] arr, int diff) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}

		for (int i : arr) {
			if (map.containsKey(diff + i)) {

				if ((diff + i) >= i) {

					for (int j = 0; j < map.get(diff + i); j++) {
						System.out.println(i + " " + (diff + i));
					}

				}

			}
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		scan.nextLine();
		String str = scan.nextLine();

		String stringArray[] = str.split(" ");
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(stringArray[i]);
		}

		int diff = scan.nextInt();
		scan.close();

		findPairsDifferenceK(arr, diff);

	}

}
