import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/*
Good morning! Here's your coding interview problem for today.

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

 */

public class DCP1 {

	public static Boolean twoNumbersAddUpToK(LinkedList<Integer> list, int k) {

		Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		for (Integer iterate : list) {

			int remaining = k - iterate;

			if (map.containsKey(remaining)) {
				return true;
			} else {
				map.put(iterate, true);
			}
		}

		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int k = scan.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 0; i < size; i++) {
			list.add(scan.nextInt());
		}

		System.out.println(twoNumbersAddUpToK(list, k));
	}

}
