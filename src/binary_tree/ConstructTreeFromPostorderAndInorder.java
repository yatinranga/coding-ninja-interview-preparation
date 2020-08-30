package binary_tree;

public class ConstructTreeFromPostorderAndInorder {

	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorderHelper(int[] post, int[] in, int poS, int poE,
			int inS, int inE) {

		if (inS > inE)
			return null;

		int rootData = post[poE];
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
		int rightInS = rootIndex + 1;
		int rightInE = inE;

		int leftPoS = poS;
		int leftLength = leftInE - leftInS + 1;
		int leftPoE = leftPoS + leftLength - 1;
		int rightPoS = leftPoE + 1;
		int rightPoE = poE - 1;

		root.left = getTreeFromPostorderAndInorderHelper(post, in, leftPoS, leftPoE, leftInS, leftInE);
		root.right = getTreeFromPostorderAndInorderHelper(post, in, rightPoS, rightPoE, rightInS, rightInE);

		return root;

	}

	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int post[], int in[]) {
		return getTreeFromPostorderAndInorderHelper(post, in, 0, post.length - 1, 0, in.length - 1);
	}

	public static void main(String[] args) {
		int[] post = { 4, 5, 2, 3, 1 };
		int[] in = { 4, 2, 5, 1, 3 };
		BinaryTreeNode<Integer> root = getTreeFromPostorderAndInorder(post, in);
		PrintTreeLevelWise.printLevelWise(root);
	}

}
