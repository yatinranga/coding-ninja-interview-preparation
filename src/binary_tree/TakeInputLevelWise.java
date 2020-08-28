package binary_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {

	public static BinaryTreeNode<Integer> takeInputLevelWise() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = scan.nextInt();
		Queue<BinaryTreeNode<Integer>> pendingQueue = new LinkedList<BinaryTreeNode<Integer>>();

		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingQueue.add(root);

		while (!pendingQueue.isEmpty()) {

			BinaryTreeNode<Integer> front = pendingQueue.poll();

			System.out.println("Enter left child of " + front.data);
			int leftChild = scan.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingQueue.add(child);
				front.left = child;
			}

			System.out.println("Enter right child of " + front.data);
			int rightChild = scan.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingQueue.add(child);
				front.right = child;
			}

		}

		return root;

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		TakeInputAndPrintRecursively.printTree(root);

	}

}
