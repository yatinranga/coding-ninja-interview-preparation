package pattern;

/*
 
4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 

MEDIUM
*/

import java.util.Scanner;

public class Pattern5 {

	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		for (int i = n; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(j + " ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(i + " ");
			}
			for (int j = i + 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		for (int i = 2; i <= n; i++) {
			for (int j = n; j >= i + 1; j--) {
				System.out.print(j + " ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(i + " ");
			}
			for (int j = i + 1; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
