package hashmap;

import java.util.HashMap;
import java.util.Scanner;

/*
You are given an array of integers that contain numbers in random order. 
Write a program to find and return the number which occurs the maximum times in the given input.

If two or more elements contend for the maximum frequency, return the element which occurs in the array first.

Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Most frequent element

Constraints :
0 <= N <= 10^8

Sample Input 1 :
13
2 12 2 11 12 2 1 2 2 11 12 2 6 
Sample Output 1 :
2

Sample Input 2 :
3
1 4 5
Sample Output 2 :
1
*/

public class MaximumFrequencyNumber {

	public static int maxFrequencyNumber(int[] arr) {

		int max = 0;
		int value = arr[0];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
				value = map.get(arr[i]) > max ? arr[i] : value;
				max = max > map.get(arr[i]) ? max : map.get(arr[i]);

			} else {
				map.put(arr[i], 1);
				value = map.get(arr[i]) > max ? arr[i] : value;
				max = max > map.get(arr[i]) ? max : map.get(arr[i]);

			}
		}

		return value;

	}

	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int size = scan.nextInt();

		int arr[] = new int[size];

		scan.close();

		String strArray[] = str.split(" ");

		for (int i = 0; i < strArray.length; i++) {
			arr[i] = Integer.parseInt(strArray[i]);
		}

		System.out.println(maxFrequencyNumber(arr));
	}

}
