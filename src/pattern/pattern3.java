package pattern;

/*

*        *
**      **
***    ***
****  ****
**********

1        1
12      21
123    321
1234  4321
1234554321


EASY
*/

import java.util.Scanner;

public class pattern3 {

	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = row * 2;
		scan.close();

		for (int i = 1; i <= row; i++) {

			int k = 1;

			for (int j = 1; j <= col; j++) {

				if (j <= i || j >= (col + 1) - i) {
					System.out.print(k);

					if (j <= row)
						k++;
					else
						k--;

					if (j == row)
						k--;

				} else {
					System.out.print(" ");
					if (j == row)
						k--;
				}

			}

			System.out.println();
		}

	}
}
