package binary_tree;

public class DiameterOfBinaryTree {

	public static int height(BinaryTreeNode<Integer> root) {

		if (root == null)
			return 0;

		int lh = height(root.left);
		int rh = height(root.right);
		return 1 + Math.max(lh, rh);

	}

	public static int diameter(BinaryTreeNode<Integer> root) {

		if (root == null)
			return 0;

		int option1 = height(root.left) + height(root.right);
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);

		return Math.max(option1, Math.max(option2, option3));
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(diameter(root));
	}

}
