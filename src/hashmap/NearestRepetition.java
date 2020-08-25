package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class NearestRepetition {

	public static int minDistance(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int diff = 0;
		int distance = 0;
		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {

				diff = i - map.get(arr[i]);

				if (distance == 0)
					distance = diff;

				if (diff < distance)
					distance = diff;

			} else {
				map.put(arr[i], i);
			}

		}

		return distance;
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

		System.out.println(minDistance(arr));
	}

}

