package pattern;

/*

*          
 * *        
  * * *      
   * * * *    
  * * *     
 * *       
*         

Medium
*/

import java.util.Scanner;

public class pattern4 {

	// divided this problem into two half

	public static void main(String[] args) {

		System.out.println("given number is always odd");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int l1 = (row + 1) / 2;
		int l2 = row / 2;
		int col = 2 * l2 + l1;
		scan.close();
		int temp = 0;

		// first half

		for (int i = 1; i <= l1; i++) {

			for (int j = 1; j <= col; j++) {

				if (j >= i && j <= i + (i - 1)) {
					System.out.print("* ");
					temp = i + (i - 1);
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

		// second half

		for (int i = 1; i <= l2; i++) {

			for (int j = 1; j < col; j++) {

				if (j >= (l2 + 1) - i && j <= temp - 2) {
					System.out.print("* ");
				} else
					System.out.print(" ");
			}
			System.out.println();
			temp = temp - 2;
		}

		/*
		 * for (int i = 1; i <= row; i++) {
		 * 
		 * for (int j = 1; j <= col; j++) {
		 * 
		 * if (i <= (row / 2) + 1) { if (j >= i && j <= (i + (i - 1))) {
		 * System.out.print("*"); temp = (i + (i - 1)); } else { System.out.print(" ");
		 * }
		 * 
		 * } else {
		 * 
		 * if (j >= ((col + 1) - i) && j <= (temp - 2)) { System.out.print("*"); temp =
		 * temp - 2; } else { System.out.print(" "); }
		 * 
		 * } }
		 * 
		 * System.out.println(); }
		 */

	}

}
