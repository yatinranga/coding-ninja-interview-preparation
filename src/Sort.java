
public class Sort {

	public static void swap(int[] numList, int firstIndex, int secondIndex) {
		int temp = numList[firstIndex];
		numList[firstIndex] = numList[secondIndex];
		numList[secondIndex] = temp;
	}

	public static void bubbleSort(int[] numList) {
		int endIndex = numList.length;
		for (int index1 = 0; index1 < (endIndex - 1); index1++) {
			boolean swapped = false;
			for (int index2 = 0; index2 < (endIndex - index1 - 1); index2++) {
				if (numList[index2] < numList[index2 + 1]) {
					swap(numList, index2, index2 + 1);
					swapped = true;
				}
			}
			if (swapped == false)
				break;

		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 5, 2 };
		bubbleSort(arr);
		bubbleSort(arr);
		bubbleSort(arr);
	}

}
