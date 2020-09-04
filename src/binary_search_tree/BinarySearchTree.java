package binary_search_tree;

import binary_tree.BinaryTreeNode;

public class BinarySearchTree {

	private BinaryTreeNode<Integer> root;

	private boolean hasDataHelper(BinaryTreeNode<Integer> root, int data) {

		if (root == null)
			return false;

		if (root.data == data) {
			return true;
		} else if (data > root.data) {
			return hasDataHelper(root.right, data);
		} else {
			return hasDataHelper(root.left, data);
		}
	}

	public boolean hasData(int data) {

		return hasDataHelper(root, data);

	}

}
