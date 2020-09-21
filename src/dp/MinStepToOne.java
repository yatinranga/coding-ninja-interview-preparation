package dp;

public class MinStepToOne {

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

	public static void main(String[] args) {

		int n = 12;
		System.out.println(countSteps(n));

	}

}
