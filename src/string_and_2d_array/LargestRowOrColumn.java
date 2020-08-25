package string_and_2d_array;

import java.util.Scanner;

public class LargestRowOrColumn {

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

		int largestRow = 0;
		int largestCol = 0;

		int rowNumber = 0;
		int colNumber = 0;

		for (int i = 0; i < row; i++) {
			int rowSum = 0;

			for (int j = 0; j < col; j++) {

				rowSum = rowSum + finalArray[i][j];

			}

			if (rowSum > largestRow) {
				largestRow = rowSum;
				rowNumber = i;
			}

		}

		for (int i = 0; i < col; i++) {
			int colSum = 0;

			for (int j = 0; j < row; j++) {
				colSum = colSum + finalArray[j][i];
			}

			if (colSum > largestCol) {
				largestCol = colSum;
				colNumber = i;
			}

		}

		if (largestRow >= largestCol)
			System.out.println("row " + rowNumber + " " + largestRow);
		else
			System.out.println("column " + colNumber + " " + largestCol);

	}

}
