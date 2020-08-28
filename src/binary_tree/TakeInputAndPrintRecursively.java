package binary_tree;

import java.util.Scanner;

public class TakeInputAndPrintRecursively {

	public static void printTree(BinaryTreeNode<Integer> root) {

		if (root == null)
			return;

		String toBePrinted = root.data + ": ";
		if (root.left != null) {
			toBePrinted = toBePrinted + "L:" + root.left.data + ", ";
		}
		if (root.right != null) {
			toBePrinted = toBePrinted + "R:" + root.right.data;
		}

		System.out.println(toBePrinted);

		printTree(root.left);
		printTree(root.right);

	}

	public static BinaryTreeNode<Integer> takeInput(Scanner s) {

		System.out.println("Enter root node :");
		int rootData = s.nextInt();

		if (rootData == -1) {
			return null;
		}

		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(s);
		root.right = takeInput(s);
		return root;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInput(scan);
		printTree(root);
	}

}
