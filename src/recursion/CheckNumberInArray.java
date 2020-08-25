package recursion;

import java.util.Scanner;

public class CheckNumberInArray {

	public static boolean checkNumber(int arr[], int num) {

		if (arr.length == 1 && arr[0] != num)
			return false;

		if (arr[arr.length - 1] == num)
			return true;

		int smallArray[] = new int[arr.length - 1];
		for (int i = 0; i < arr.length - 1; i++) {
			smallArray[i] = arr[i];

		}

		return checkNumber(smallArray, num);

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

		int num = scan.nextInt();
		scan.close();

		System.out.println(checkNumber(arr, num));
	}

}
