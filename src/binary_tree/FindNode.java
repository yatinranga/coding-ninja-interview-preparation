package binary_tree;

import java.util.Scanner;

public class FindNode {

	public static Boolean findNode(BinaryTreeNode<Integer> root, int node) {

		if (root == null) {
			return false;
		}

		Boolean ans;
		if (node == root.data) {
			return true;
		}

		ans = findNode(root.left, node);
		if (ans) {
			return ans;
		}
		ans = findNode(root.right, node);

		return ans;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the node you want to search in binary tree");
		int node = scan.nextInt();
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(findNode(root, node));
		scan.close();
	}

}
