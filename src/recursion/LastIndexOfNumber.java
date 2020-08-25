package recursion;

import java.util.Scanner;

public class LastIndexOfNumber {

	public static int index = -1;

	public static int lastIndex(int arr[], int toBeFound, int startPoint) {

		if (startPoint >= arr.length - 1) {

			if (arr[startPoint] == toBeFound)
				index = startPoint;

			return index;
		}

		if (arr[startPoint] == toBeFound)
			index = startPoint;

		return lastIndex(arr, toBeFound, startPoint + 1);

	}

	public static int lastIndex(int input[], int x) {

		return lastIndex(input, x, 0);
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

		System.out.println(lastIndex(arr, toBeFound));

	}

}
