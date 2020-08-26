package tree;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise {

	public static void printLevelWise(TreeNode<Integer> root) {

		if (root == null)
			return;

		Queue<TreeNode<Integer>> pendingQueue = new LinkedList<TreeNode<Integer>>();
		pendingQueue.add(root);

		while (!pendingQueue.isEmpty()) {
			root = pendingQueue.poll();

			System.out.print(root.data + " ");

			for (int i = 0; i < root.children.size(); i++) {
				pendingQueue.add(root.children.get(i));
			}

		}

	}

	public static void main(String... s) {

		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		printLevelWise(root);
	}

}
