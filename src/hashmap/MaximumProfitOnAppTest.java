package hashmap;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumProfitOnAppTest {

	public static int maximumProfit(int arr[]) {

		/*
		 * int priceOfMyApp = 20; int count = 0;
		 * 
		 * for (int i : arr) { if (i >= priceOfMyApp) count++; }
		 * 
		 * return (count * priceOfMyApp);
		 */
		
		 Arrays.sort(arr);
		 int cost[]= new int[arr.length];
		 for (int i = 0; i < arr.length; i++) {
			 cost[i] = arr[i]*(arr.length-i);
		}
		 int max = Integer.MIN_VALUE;
		 for(int i : cost) {
			 if(i>max)
				 max=i;
		 }
		 return max;
	}

	public static void main(String... s) {

		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();

		scan.nextLine();
		String str = scan.nextLine();
		scan.close();

		String stringArray[] = str.split(" ");
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(stringArray[i]);
		}

		System.out.println(maximumProfit(arr));
	}

}
