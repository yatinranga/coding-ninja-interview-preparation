package tree;

import java.util.LinkedList;
import java.util.Queue;

public class ReplaceNodeWithDepth {

	public static void replaceWithDepthValue(TreeNode<Integer> root) {

		if (root == null)
			return;

		int height = 0;
		Queue<TreeNode<Integer>> pendingQueue = new LinkedList<TreeNode<Integer>>();

		pendingQueue.add(root);

		while (!pendingQueue.isEmpty()) {

			int queueSize = pendingQueue.size();

			while (queueSize != 0) {

				TreeNode<Integer> node = pendingQueue.poll();
				node.data = height;
				queueSize--;

				for (TreeNode<Integer> child : node.children) {
					pendingQueue.add(child);
				}

			}
			height++;

		}

	}

	public static void main(String[] args) {
		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		replaceWithDepthValue(root);
		PrintLevelWise.printLevelWise(root);
	}

}
