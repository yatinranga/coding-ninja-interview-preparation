package recursion;

import java.util.Scanner;

public class SumOfDigits {

	static int sum = 0;

	public static int sumOfDigits(int input) {

		if (input == 0) {
			return sum;
		}

		sum = sum + (input % 10);
		sumOfDigits(input / 10);

		return sum;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(sumOfDigits(scan.nextInt()));
		scan.close();
	}

}
