package recursion;

import java.util.Scanner;

public class NumberOfDigits {

	public static int count(int number) {

		if (number == 0)
			return 0;

		return count(number / 10) + 1;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(count(scan.nextInt()));
		scan.close();
	}

}
