package recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AllIndicesOfNumber {

	public static ArrayList<Integer> finalList = new ArrayList<Integer>();

	public static ArrayList<Integer> allIndexes(int arr[], int toBeFound, int startPoint) {

		if (startPoint >= arr.length - 1) {
			if (arr[startPoint] == toBeFound)
				finalList.add(startPoint);

			return finalList;
		}

		if (arr[startPoint] == toBeFound)
			finalList.add(startPoint);

		allIndexes(arr, toBeFound, startPoint + 1);

		return finalList;
	}

	public static int[] allIndexes(int input[], int x) {
		List<Integer> finalList = allIndexes(input, x, 0);
		int[] farr = finalList.stream().mapToInt(i -> i).toArray();
		return farr;

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

		int finalArray[] = allIndexes(arr, toBeFound);

		for (Integer integer : finalArray) {
			System.out.println(integer + " ");
		}

	}

}
