package dp;

public class MinStepToOne {

	// finding min step to 1 using recursion
	public static int countSteps(int n) {

		// base case
		if (n == 1)
			return 0;

		// substarct 1 option
		int opt1 = countSteps(n - 1);
		int minSteps = opt1;

		// divide by 3 option
		if (n % 3 == 0) {
			int opt2 = countSteps(n / 3);
			minSteps = opt2 < minSteps ? opt2 : minSteps;
		}

		// divide by option 2
		if (n % 2 == 0) {
			int opt3 = countSteps(n / 2);
			minSteps = opt3 < minSteps ? opt3 : minSteps;
		}

		return 1 + minSteps;

	}

	private static int countStepsusingMemoization(int n, int[] storage) {

		// base case
		if (n == 1) {
			storage[n] = 0;
			return storage[n];
		}

		if (storage[n] != 0) {
			return storage[n];
		}

		// substarct 1 option
		int opt1 = countStepsusingMemoization(n - 1, storage);
		int minSteps = opt1;

		// divide by 3 option
		if (n % 3 == 0) {
			int opt2 = countStepsusingMemoization(n / 3, storage);
			minSteps = opt2 < minSteps ? opt2 : minSteps;
		}

		// divide by option 2
		if (n % 2 == 0) {
			int opt3 = countStepsusingMemoization(n / 2, storage);
			minSteps = opt3 < minSteps ? opt3 : minSteps;
		}

		storage[n] = 1 + minSteps;

		return storage[n];

	}

	public static int countStepsusingMemoization(int n) {
		int[] storage = new int[n + 1];
		return countStepsusingMemoization(n, storage);
	}

	public static int countStepsDP(int n) {
		int[] storage = new int[n + 1];
		storage[1] = 0; // because we're using bottom to top approach

		for (int i = 2; i <= n; i++) {
			int min = storage[i - 1];

			if (i % 3 == 0) {
				if (min > storage[i / 3]) {
					min = storage[i / 3];
				}
			}

			if (i % 2 == 0) {
				if (min > storage[i / 2]) {
					min = storage[i / 2];
				}
			}

			storage[i] = 1 + min;
		}

		return storage[n];

	}

	public static void main(String[] args) {

		int n = 120;
		System.out.println(countStepsusingMemoization(n));
		System.out.println(countStepsDP(n));
		System.out.println(countSteps(n));

	}

}
