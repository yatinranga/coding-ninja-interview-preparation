package binary_search_tree;

import java.util.LinkedList;
import java.util.Queue;

import binary_tree.BinaryTreeNode;
import binary_tree.TakeInputLevelWise;

/**
 * 
 * @author Anonymous
 *
 *         Given a Binary Tree with N number of nodes, for each node create a
 *         new duplicate node, and insert that duplicate as left child of the
 *         original node. Note : Root will remain same. So you just need to
 *         insert nodes in the given Binary Tree and no need to print or return
 *         anything. Input format :
 * 
 *         Elements in level order form (separated by space) (If any node does
 *         not have left or right child, take -1 in its place)
 * 
 *         Output Format :
 * 
 *         Level order traversal of updated tree. (Every level in new line)
 * 
 *         Constraints : 1 <= N <= 1000 Sample Input :
 * 
 *         8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
 * 
 *         Sample Output :
 * 
 *         8 8 10 5 10 5 6 2 6 7
 */

public class CreateAndInsertDuplicateNode {

	public static void levelOrderTraversal(BinaryTreeNode<Integer> root) {

		if (root == null)
			return;

		Queue<BinaryTreeNode<Integer>> pendingQueue = new LinkedList<BinaryTreeNode<Integer>>();
		pendingQueue.add(root);

		while (!pendingQueue.isEmpty()) {

			int n = pendingQueue.size();

			while (n > 0) {

				BinaryTreeNode<Integer> output = pendingQueue.poll();
				System.out.print(output.data + " ");
				n--;

				if (output.left != null) {
					pendingQueue.add(output.left);
				}
				if (output.right != null) {
					pendingQueue.add(output.right);
				}

			}
			System.out.println();

		}

	}

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;
//
//		insertDuplicateNode(root.left);
//		BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<Integer>(root.data);
//		duplicate.left = root.left;
//		root.left = duplicate;
//		insertDuplicateNode(root.right);

		BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);
		BinaryTreeNode<Integer> rootLeft = root.left;
		root.left = newNode;
		newNode.left = rootLeft;

		insertDuplicateNode(rootLeft);
		insertDuplicateNode(root.right);

	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		insertDuplicateNode(root);
		levelOrderTraversal(root);

	}

}
