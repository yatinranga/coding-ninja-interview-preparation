package binary_search_tree;

import binary_tree.BinaryTreeNode;

public class ConstructBSTfromSortedArray {

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int start, int end) {

		if (start > end)
			return null;

		int mid = start + (end - start) / 2;

		BinaryTreeNode<Integer> output = new BinaryTreeNode<Integer>(arr[mid]);
		output.left = SortedArrayToBST(arr, start, mid - 1);
		output.right = SortedArrayToBST(arr, mid + 1, end);
		return output;
	}

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr) {
		return SortedArrayToBST(arr, 0, arr.length - 1);

	}

	public static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		BinaryTreeNode<Integer> root = SortedArrayToBST(arr);
		preOrder(root);

	}

}
