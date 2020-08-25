package recursion;

import java.util.Scanner;

public class SumOfArray {

	public static int sum(int input[]) {

		if (input.length == 1)
			return input[0];

		int smallArray[] = new int[input.length - 1];
		for (int i = 0; i < input.length - 1; i++) {
			smallArray[i] = input[i];
		}

		int sum = 0;
		sum = sum(smallArray) + input[input.length - 1];

		return sum;

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

		System.out.println(sum(arr));

	}

}
