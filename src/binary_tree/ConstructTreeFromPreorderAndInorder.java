package binary_tree;

public class ConstructTreeFromPreorderAndInorder {

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorderHelper(int[] pre, int[] in, int preS, int preE,
			int inS, int inE) {

		if (inS > inE) {
			return null;
		}

		int rootData = pre[preS];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		int rootIndex = -1;
		for (int i = inS; i <= inE; i++) {
			if (in[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		if (rootIndex == -1)
			return null;

		int leftInS = inS;
		int leftInE = rootIndex - 1;
		int leftPrS = preS + 1;
		int leftPrE = leftInE - leftInS + leftPrS;
		int rightInS = rootIndex + 1;
		int rightInE = inE;
		int rightPrS = leftPrE + 1;
		int rightPrE = preE;

		root.left = getTreeFromPreorderAndInorderHelper(pre, in, leftPrS, leftPrE, leftInS, leftInE);
		root.right = getTreeFromPreorderAndInorderHelper(pre, in, rightPrS, rightPrE, rightInS, rightInE);

		return root;
	}

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in) {
		return getTreeFromPreorderAndInorderHelper(pre, in, 0, pre.length - 1, 0, in.length - 1);
	}

	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 5, 3 };
		int[] in = { 4, 2, 5, 1, 3 };
		BinaryTreeNode<Integer> root = getTreeFromPreorderAndInorder(pre, in);
		PrintTreeLevelWise.printLevelWise(root);

	}

}
