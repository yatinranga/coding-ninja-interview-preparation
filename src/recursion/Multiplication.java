package recursion;

import java.util.Scanner;

/*
Given two integers m & n, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
Input format : m and n (in different lines)

Sample Input :
3 
5
Sample Output -
15
*/

public class Multiplication {

	static int count = 1;
	static int sum = 0;

	public static int multiplyTwoIntegers(int val1, int val2) {

		if (count == val2) {
			sum = sum + val1;
			return sum;
		}

		sum = sum + val1;
		count++;

		multiplyTwoIntegers(val1, val2);
		return sum;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();
		scan.close();
		System.out.println(multiplyTwoIntegers(val1, val2));

	}

}
