package binary_search_tree;

import java.util.Scanner;

import binary_tree.BinaryTreeNode;
import binary_tree.TakeInputLevelWise;

public class PrintElementsInRange {

	public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root, int k1, int k2) {

		if (root == null)
			return;

		if (root.data >= k1) {
			printNodeFromK1ToK2(root.left, k1, k2);
		}

		if (root.data >= k1 && root.data <= k2) {
			System.out.print(root.data + " ");
		}

		if (root.data <= k2) {
			printNodeFromK1ToK2(root.right, k1, k2);
		}

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range");
		int k1 = scan.nextInt();
		scan.hasNextLine();
		System.out.println("to");
		int k2 = scan.nextInt();
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		printNodeFromK1ToK2(root, k1, k2);

	}

}
