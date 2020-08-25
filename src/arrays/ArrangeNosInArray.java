package arrays;

public class ArrangeNosInArray {

	public static int[] arrange(int n) {

		int arr[] = new int[n];

		if (n % 2 != 0) {

			for (int i = 0; i <= n / 2; i++) {

				if (i == 0) {

					arr[i] = 1;
					continue;
				}

				arr[i] = arr[i - 1] + 2;

			}

			for (int i = n - 1; i > (n / 2); i--) {

				if (i == n - 1) {
					arr[i] = 2;
					continue;
				}

				arr[i] = arr[i + 1] + 2;

			}

		} else {

			for (int i = 0; i < n / 2; i++) {

				if (i == 0) {

					arr[i] = 1;
					continue;
				}

				arr[i] = arr[i - 1] + 2;

			}

			for (int i = n - 1; i >= (n / 2); i--) {

				if (i == n - 1) {
					arr[i] = 2;
					continue;
				}

				arr[i] = arr[i + 1] + 2;

			}

		}

		return arr;
	}

	public static void main(String... s) {

		int arr[] = new int[6];
		arr = arrange(6);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
