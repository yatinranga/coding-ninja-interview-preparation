package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubset {

	public static int max(int[] arr) {

		return 0;

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

		System.out.println(max(arr));

	}

}
