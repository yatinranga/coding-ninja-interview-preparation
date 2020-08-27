package tree;

import java.util.Scanner;

public class PrintNodesAtDepth {

	public static void printNodeAtDepth(TreeNode<Integer> root, int depth) {

		if (depth < 0)
			return;

		if (depth == 1) {
			System.out.println(root.data);
			return;
		}

		for (int i = 0; i < root.children.size(); i++) {
			printNodeAtDepth(root.children.get(i), depth - 1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.close();
		System.out.println("enter depth");
		int depth = scan.nextInt();
		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		printNodeAtDepth(root, depth);
	}

}
