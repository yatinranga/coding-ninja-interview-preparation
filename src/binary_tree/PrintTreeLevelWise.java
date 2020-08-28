package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeLevelWise {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {

		if (root == null)
			return;

		Queue<BinaryTreeNode<Integer>> pendingQueue = new LinkedList<BinaryTreeNode<Integer>>();

		pendingQueue.add(root);

		while (!pendingQueue.isEmpty()) {
			int n = pendingQueue.size();

			while (n != 0) {

				BinaryTreeNode<Integer> front = pendingQueue.poll();
				String toBePrinted = front.data + ":";

				if (front.left != null) {
					toBePrinted = toBePrinted + "L:" + front.left.data + ",";
					pendingQueue.add(front.left);
				}
				if (front.right != null) {
					toBePrinted = toBePrinted + "R:" + front.right.data;
					pendingQueue.add(front.right);
				}

				System.out.println(toBePrinted);
				n--;
			}
		}

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		printLevelWise(root);

	}

}
