package binary_search_tree;

import java.util.Scanner;

import binary_tree.BinaryTreeNode;
import binary_tree.TakeInputLevelWise;

public class LowestCommonAncestor {

	public static int lcaBinaryTree(BinaryTreeNode<Integer> root, int a, int b) {

		if (root == null)
			return -1;

		if (root.data == a | root.data == b)
			return root.data;

		int left = lcaBinaryTree(root.left, a, b);
		int right = lcaBinaryTree(root.right, a, b);

		if (left != -1 && right != -1)
			return root.data;

		if (left != -1)
			return left;
		else
			return right;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter node 1");
		int a = scan.nextInt();
		System.out.println("enter node 2");
		int b = scan.nextInt();
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(lcaBinaryTree(root, a, b));
		scan.close();

	}

}
