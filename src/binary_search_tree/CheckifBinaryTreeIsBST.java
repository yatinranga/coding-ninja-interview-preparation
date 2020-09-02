package binary_search_tree;

import binary_tree.BinaryTreeNode;
import binary_tree.TakeInputLevelWise;

public class CheckifBinaryTreeIsBST {

//	public static boolean isBST(BinaryTreeNode<Integer> root) {
//
//		boolean ans;
//
//		if (root == null)
//			return true;
//
//		if (root.left != null && root.left.data < root.data) {
//			ans = isBST(root.left);
//			if (!ans) {
//				return ans;
//			}
//		} else {
//			if (root.left == null) {
//				//return true;
//			} else {
//				return false;
//			}
//		}
//
//		if (root.right != null && root.right.data > root.data) {
//			ans = isBST(root.right);
//			if (!ans) {
//				return ans;
//			}
//		} else {
//			if (root.right == null) {
//			//	return true;
//			} else {
//				return false;
//			}
//		}
//
//		return true;
//
//	}

	public static boolean isBST(BinaryTreeNode<Integer> root, int min, int max) {

		if (root == null) {
			return true;
		}

		if (root.data > min && root.data <= max) {
			boolean ans1 = isBST(root.left, min, root.data - 1);
			boolean ans2 = isBST(root.right, root.data, max);
			return ans1 && ans2;

		} else {
			return false;
		}
	}

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(isBST(root));
	}

}
