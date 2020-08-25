package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class EqualSumPairTest {

	public static boolean findPairs(int[] arr) {

		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : arr) {

			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
				count += 2;
				if (count >= 4)
					return true;
			} else {
				map.put(i, 1);
				if (count >= 4)
					return true;
			}

		}

		if(arr.length <= 2)
		
		for (int i = 0; i < arr.length - 1; i++) {

			int total = arr[i] + arr[i + 1];
			// int toBeFind = total - arr[i + 1];

			for (int j = i + 1; j < arr.length-1; j++) {

				if (arr[j] + arr[j + 1] == total)
					return true;

			}

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

		System.out.println(findPairs(arr));

	}

}
