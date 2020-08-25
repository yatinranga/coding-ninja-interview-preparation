package tree;

import java.util.Scanner;

public class TakeInputAndPrintRecursive {

	static Scanner scan = new Scanner(System.in);

	public static TreeNode<Integer> takeInput() {

		int n;

		System.out.println("enter next node data");
		n = scan.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("enter number of children for " + n);
		int childNode = scan.nextInt();

		for (int i = 0; i < childNode; i++) {
			TreeNode<Integer> child = takeInput();
			root.children.add(child);
		}

		return root;
	}

	public static void printTree(TreeNode<Integer> root) {

		if (root.data == null) {
			return;
		}

		String s = root.data + ":";

		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ", ";
		}

		System.out.println(s);

		for (int i = 0; i < root.children.size(); i++) {
			printTree(root.children.get(i));
		}
	}

	public static void main(String[] s) {
		TreeNode<Integer> root = takeInput();
		printTree(root);
	}

}
