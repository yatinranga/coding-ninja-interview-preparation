package string_and_2d_array;

import java.util.Scanner;

/*
 
 Sample Input 1 :
xyz
Sample Output 1 :
x
xy
xyz
y
yz
z
  
*/

public class PrintAllSubstrings {

	public static void printSubstrings(String s) {

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			for (int j = i; j < s.length(); j++) {
				String str = s.substring(i, j + 1);
				boolean flag = true;

				for (int k = 0, l = str.length() - 1; k < l; k++, l--) {

					if (str.length() == 1) {
						count++;
						break;
					}

					if (str.charAt(k) == str.charAt(l))
						continue;
					else {
						flag = false;
						break;
					}

				}

				if (flag) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

	public static void main(String... s) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		scan.close();

		printSubstrings(str);
	}

}
