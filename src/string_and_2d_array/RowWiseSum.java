package string_and_2d_array;

/*
 
 Input Format :
Line 1 : Two integers M and N (separated by space) 
Line 2 : Matrix elements of each row (separated by space)

Output Format :
Sum of every ith row elements (separated by space)

Constraints :
1 <= M, N <= 10^3

Sample Input :
4 2 
1 2 3 4 5 6 7 8

Sample Output :
3 7 11 15 


 */

import java.util.Scanner;

public class RowWiseSum {

	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);

		String firstInput = scan.nextLine();
		String secondInput = scan.nextLine();
		scan.close();

		int row = 0;
		int col = 0;

		String[] arr1 = firstInput.split(" ");
		int rowColArray[] = new int[arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			rowColArray[i] = Integer.parseInt(arr1[i]);
		}

		row = rowColArray[0];
		col = rowColArray[1];
		int finalArray[][] = new int[row][col];

		String[] arr2 = secondInput.split(" ");
		int valueArray[] = new int[arr2.length];

		for (int i = 0; i < arr2.length; i++) {
			valueArray[i] = Integer.parseInt(arr2[i]);
		}

		for (int x = 0; x < valueArray.length; x++) {

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					finalArray[i][j] = valueArray[x];
					x++;
				}
			}

		}

		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {
				sum = sum + finalArray[i][j];
			}
			System.out.print(sum + " ");
		}

	}

}
