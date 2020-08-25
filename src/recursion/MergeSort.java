package recursion;

import java.util.Scanner;

public class MergeSort {

	public static int[] merge(int[] leftArr, int[] rightArr, int[] finalArray) {

		int leftLength = leftArr.length;
		int rightLength = rightArr.length;

		int left = 0, right = 0, k = 0;

		while (left < leftLength && right < rightLength) {

			if (leftArr[left] <= rightArr[right]) {
				finalArray[k] = leftArr[left];
				k++;
				left++;
			} else {
				finalArray[k] = rightArr[right];
				k++;
				right++;
			}
		}

		while (left < leftLength) {
			finalArray[k] = leftArr[left];
			k++;
			left++;
		}

		while (right < rightLength) {
			finalArray[k] = leftArr[right];
			k++;
			right++;
		}

		return finalArray;
	}

	public static int[] mergeSort(int[] arr) {

		if (arr.length < 2)
			return arr;

		int mid = arr.length / 2;

		int[] leftArr = new int[mid];
		int[] rightArr = new int[arr.length - mid];

		for (int i = 0; i < leftArr.length; i++) {
			leftArr[i] = arr[i];
		}

		for (int i = 0; i < rightArr.length; i++) {
			rightArr[i] = arr[mid++];
		}

		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(leftArr, rightArr, arr);

		return arr;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size1 = scan.nextInt();

		scan.nextLine();
		String str1 = scan.nextLine();
		scan.close();

		String stringArray1[] = str1.split(" ");
		int arr1[] = new int[size1];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(stringArray1[i]);
		}

		for (int iterate : mergeSort(arr1)) {
			System.out.print(iterate + " ");
		}

	}

}
