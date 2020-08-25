package recursion;

import java.util.Scanner;

public class checkSorted {

	public static Boolean checkSorted(int arr[]) {

		if (arr.length == 1)
			return true;

		if (arr[0] > arr[1])
			return false;

		int smallArr[] = new int[arr.length - 1];

		for (int i = 1; i < arr.length; i++) {
			smallArr[i - 1] = arr[i];
		}

		if (checkSorted(smallArr))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];

		scan.nextLine();
		String str = scan.nextLine();
		String strArr[] = str.split(" ");
		scan.close();

		for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
		}

		System.out.println(checkSorted(arr));

	}

}
