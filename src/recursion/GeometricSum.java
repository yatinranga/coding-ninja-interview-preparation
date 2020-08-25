package recursion;

import java.util.Scanner;

/*
Given k, find the geometric sum i.e.

1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 

using recursion. Return the answer.

Sample Input :
3
Sample Output :
1.875
*/

public class GeometricSum {

	static int count = 1;
	static double sum = 0;
	static int preserve = 0;
	static boolean flag = true;

	public static double findGeometricSum(int k) {

		if (k == 0)
			return 1;

		if (flag) {
			preserve = k;
			flag = false;
		}

		if (count == preserve)
			return sum + (1 / Math.pow(2, count)) + 1;

		sum = sum + (1 / Math.pow(2, count));

		sum = findGeometricSum(++count);

		return sum;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		System.out.println(findGeometricSum(number));

	}

}
