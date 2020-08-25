package recursion;

import java.util.Scanner;

public class CalculatePower {

	public static int power(int base, int power) {

		if (power == 0)
			return 1;

		if (power == 1)
			return base;

		return base * power(base, power - 1);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int base = scan.nextInt();
		int power = scan.nextInt();

		System.out.println(power(base, power));

	}

}
