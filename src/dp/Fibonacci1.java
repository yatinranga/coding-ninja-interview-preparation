package dp;

public class Fibonacci1 {

	private static int fibHelper(int n, int[] fibArray) {
		if (n == 0 || n == 1) {
			fibArray[n] = n;
			return fibArray[n];
		}

		if (fibArray[n] != -1) {
			return fibArray[n];
		}

		fibArray[n] = fibHelper(n - 1, fibArray) + fibHelper(n - 2, fibArray);
		return fibArray[n];
	}

	public static int fib(int n) {
		int[] fibArray = new int[n + 1];
		for (int i = 0; i < fibArray.length; i++) {
			fibArray[i] = -1;
		}
		return fibHelper(n, fibArray);

	}

	public static void main(String[] args) {

		int n = 4;
		System.out.println(fib(n));
	}

}
