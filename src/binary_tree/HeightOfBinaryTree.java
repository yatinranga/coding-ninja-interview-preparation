package binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {

	public static int findHeight(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return 0;
		}

		int height = 0;

		Queue<BinaryTreeNode<Integer>> pendingQueue = new LinkedList<BinaryTreeNode<Integer>>();
		pendingQueue.add(root);

		while (!pendingQueue.isEmpty()) {
			int n = pendingQueue.size();

			while (n != 0) {
				BinaryTreeNode<Integer> front = pendingQueue.poll();
				if (front.left != null) {
					pendingQueue.add(front.left);
				}
				if (front.right != null) {
					pendingQueue.add(front.right);
				}
				n--;
			}
			height++;
		}

		return height;

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(findHeight(root));

	}

}
