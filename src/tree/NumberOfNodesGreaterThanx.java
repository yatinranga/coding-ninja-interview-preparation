package tree;

import java.util.Scanner;

public class NumberOfNodesGreaterThanx {

	public static int numberOfNodesGreaterThanX(TreeNode<Integer> root, int num) {

		if (root == null)
			return 0;

		int count = 0;

		if (root.data > num)
			count++;

		for (int i = 0; i < root.children.size(); i++) {
			count = count + numberOfNodesGreaterThanX(root.children.get(i), num);
		}

		return count;

	}

	public static void main(String... s) {

		System.out.println("enter number x");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		// 2nd parameter is the number X
		System.out.println(numberOfNodesGreaterThanX(root, x));
	}
}
