package hashmap;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 You are given with an array (of size N) consisting of positive and negative integers that contain numbers in random order.
Write a program to return true if there exists a sub-array whose sum is zero else, return false.

Input Format :
Line 1 : An Integer N i.e. size of array 
Line 2 : N integers, elements of the array (separated by space)

Output Format :
true or false

Constraints :
1 <= N <= 10^5

Sample Input 1 :
6 
7 1 3 -4 5 1
Sample Output 1 :
true

Sample Input 2 :
5 
-6 7 6 2 1
Sample Output 2 :
false
 */

public class ZeroSumSubArray {

	public static boolean subarraySumTo0(int[] arr) {

		/*
		 * the time complexity of this approach is O(n^2);
		 */

//		for (int i = 0; i < arr.length; i++) {
//		int sum = 0;

//			for (int j = i; j < arr.length; j++) {

//				sum = sum + arr[j];

//				if (sum == 0)
//					return true;
//			}

//		}

//		return false;

		/*
		 * the time complexity of this approach is O(n)
		 */

		Set<Integer> set = new HashSet<Integer>();

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (arr[i] == 0 || sum == 0 || set.contains(sum)) {
				return true;
			}

			set.add(sum);
		}

		return false;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		scan.nextLine();
		String str = scan.nextLine();
		scan.close();

		String stringArray[] = str.split(" ");
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(stringArray[i]);
		}

		System.out.println(subarraySumTo0(arr));

	}

}
