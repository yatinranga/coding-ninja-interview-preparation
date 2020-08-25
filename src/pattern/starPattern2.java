package pattern;

import java.util.Scanner;

/*
	1
   23
  345
 4567


EASY
*/

public class starPattern2 {

	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int col = rows;
		scan.close();

		for (int i = 1; i <= rows; i++) {

			int k = i;

			for (int j = 1; j <= col; j++) {

				if (j >= (rows + 1) - i && j <= rows) {
					System.out.print(k);
					k++;
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}

	}

}
