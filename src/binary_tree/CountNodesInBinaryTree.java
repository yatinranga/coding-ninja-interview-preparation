package binary_tree;

public class CountNodesInBinaryTree {

	public static int countNodesInBinaryTree(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return 0;
		}

		int count = 1;
		count += countNodesInBinaryTree(root.left);
		count += countNodesInBinaryTree(root.right);

		return count;

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(countNodesInBinaryTree(root));

	}

}
