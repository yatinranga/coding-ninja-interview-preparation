package pattern;

import java.util.Scanner;

/*
  
@author Anonymous
 
Sample Input :
5
Sample Output :
           1
          232
         34543
        4567654
       567898765

*/

public class TriangleOfNumbers {

	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);
		int rows = scan.nextInt();
		int col = (rows * 2) - 1;
		scan.close();

		for (int i = 1; i <= rows; i++) {

			int k = i;

			for (int j = 1; j <= col; j++) {

				if (j >= (rows + 1) - i && j <= (rows - 1) + i) {

					System.out.print(k);

					if (j < rows)
						k++;
					else
						k--;

				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}

}
