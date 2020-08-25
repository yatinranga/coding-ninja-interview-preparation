package recursion;

import java.util.Scanner;

public class FibonacciNumber {
	public static int fibo(int n) {

		if (n == 0 || n == 1)
			return n;

		return fibo(n - 1) + fibo(n - 2);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(fibo(scan.nextInt()));
		scan.close();

	}

}
