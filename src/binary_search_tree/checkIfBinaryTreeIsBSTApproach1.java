package binary_search_tree;

import binary_tree.BinaryTreeNode;
import binary_tree.TakeInputLevelWise;

public class checkIfBinaryTreeIsBSTApproach1 {

	public static int maximum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}

		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}

	public static int minimum(BinaryTreeNode<Integer> root) {
		if (root == null)
			return Integer.MAX_VALUE;

		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));

	}

	public static boolean isBST(BinaryTreeNode<Integer> root) {

		if (root == null)
			return true;

		int leftMax = maximum(root);
		int rightMin = minimum(root);

		if (leftMax >= root.data) {
			return false;
		}

		if (rightMin < root.data) {
			return false;
		}

		boolean isLeftBST = isBST(root.left);
		boolean isRightBst = isBST(root.right);

		if (isLeftBST && isRightBst) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(isBST(root));
	}

}
