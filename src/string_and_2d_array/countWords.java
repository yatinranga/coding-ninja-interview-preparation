package string_and_2d_array;

import java.util.Scanner;

/*
 
 count the number of words in string
 
Sample Input :
this is a sample string
Sample Output :
5
*/

public class countWords {

	public static int countWords(String str) {

		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ' ')
				count++;
		}

		return count+1;
	}

	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		int count = countWords(str);
		System.out.println(count);
	}

}
