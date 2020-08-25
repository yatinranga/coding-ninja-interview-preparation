import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyCode {

	public static int uniquePairs(String[] Arr) {

		if (Arr.length == 0)
			return -1;

		int count = 0;

		for (int j = 0; j < Arr.length; j++) {

			Map<Character, Integer> m1 = new HashMap<Character, Integer>();

			for (int i = 0; i < Arr[j].length(); i++) {
				if (m1.get(Arr[j].charAt(i)) != null) {
					m1.put(Arr[j].charAt(i), m1.get(Arr[j].charAt(i)) + 1);
				} else {
					m1.put(Arr[j].charAt(i), 1);
				}
			}

			for (int k = 0; k < Arr.length; k++) {

				if (k == j)
					continue;

				String str = Arr[k];
				boolean status = true;

				for (int i = 0; i < str.length(); i++) {

					if (m1.containsKey(str.charAt(i))) {
						continue;
					} else {
						status = false;
						break;
					}

				}

				if (status == true) {
					count++;
				}

			}

		}

		if (count == 0)
			return -1;
		else
			return count;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String inputString = scan.nextLine();
		String[] inArr = inputString.split(",");

		System.out.println(uniquePairs(inArr));

	}

}
