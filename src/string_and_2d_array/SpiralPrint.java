package string_and_2d_array;

import java.util.Scanner;

/*
Input format :
Line 1 : N and M, No. of rows & No. of columns (separated by space) followed by N*M  elements in row wise fashion.

Sample Input :
 4 4 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
Sample Output :
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
*/

public class SpiralPrint {

	public static void spiralPrint(int matrix[][]) {

		int row = matrix.length;
		int col = matrix[0].length;
		int top = 0;
		int bottom = row - 1;
		int left = 0;
		int right = col - 1;

		int dir = 0;

		while (top <= bottom && left <= right) {

			if (dir == 0) {

				for (int i = left; i <= right; i++) {
					System.out.print(matrix[top][i] + " ");
				}
				top++;
				dir = 1;
			} else if (dir == 1) {
				for (int i = top; i <= bottom; i++) {
					System.out.print(matrix[i][right] + " ");
				}
				right--;
				dir = 2;
			} else if (dir == 2) {
				for (int i = right; i >= left; i--) {
					System.out.print(matrix[bottom][i] + " ");
				}
				bottom--;
				dir = 3;
			} else if (dir == 3) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(matrix[i][left] + " ");
				}
				left++;
				dir = 0;
			}

		}

	}

	public static void main(String[] args) {

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

		spiralPrint(finalArray);
	}

}
