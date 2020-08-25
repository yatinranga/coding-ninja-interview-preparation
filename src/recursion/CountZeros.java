package recursion;

import java.util.Scanner;

public class CountZeros {

	public static int count = 0;

	public static int countZerosRec(int input) {

		if (input == 0)
			return count;

		if (input % 10 == 0)
			count++;

		countZerosRec(input / 10);

		return count;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int value = scan.nextInt();
		scan.close();

		System.out.println(countZerosRec(value));

	}

}
