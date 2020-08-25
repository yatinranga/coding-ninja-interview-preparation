package recursion;

import java.util.Scanner;

public class FirstIndexOfNumber {

	public static int firstIndex(int arr[], int toBeFound, int startIndex) {

		if (startIndex >= arr.length - 1) {
			if (arr[startIndex] == toBeFound)
				return startIndex;

			return -1;
		}

		if (arr[startIndex] == toBeFound)
			return startIndex;

		return firstIndex(arr, toBeFound, startIndex + 1);

	}

	public static int firstIndex(int arr[], int toBeFound) {
		return firstIndex(arr, toBeFound, 0);
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];

		scan.nextLine();
		String str = scan.nextLine();
		String strArr[] = str.split(" ");
		int toBeFound = scan.nextInt();
		scan.close();

		for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}

		System.out.println(firstIndex(arr, toBeFound));

	}

}
