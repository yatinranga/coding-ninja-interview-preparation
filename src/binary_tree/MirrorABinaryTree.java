package binary_tree;

public class MirrorABinaryTree {

	public static void mirror(BinaryTreeNode<Integer> root) {

		if (root == null)
			return;

		mirror(root.left);
		mirror(root.right);

		if (root.left == null && root.right == null)
			return;

		if (root.left != null && root.right != null) {
			BinaryTreeNode<Integer> temp = root.left;
			root.left = root.right;
			root.right = temp;
		}

		if (root.left == null && root.right != null) {
			root.left = root.right;
			root.right = null;
		}
		if (root.right == null && root.left != null) {
			root.right = root.left;
			root.left = null;
		}

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		mirror(root);
		PrintTreeLevelWise.printLevelWise(root);
	}
}
