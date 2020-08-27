package tree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfTree {

	public static int nodeWithLargestData(TreeNode<Integer> root) {

		if (root == null)
			return 0;

		int height = 0;

		Queue<TreeNode<Integer>> pendingQueue = new LinkedList<TreeNode<Integer>>();
		pendingQueue.add(root);

		while (!pendingQueue.isEmpty()) {
			int n = pendingQueue.size();

			while (n != 0) {
				root = pendingQueue.poll();

				for (int i = 0; i < root.children.size(); i++) {
					pendingQueue.add(root.children.get(i));
				}
				n--;
			}

			height++;
		}

		return height;

	}

	public static void main(String[] args) {

		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(nodeWithLargestData(root));
	}

}
