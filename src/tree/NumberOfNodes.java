package tree;

public class NumberOfNodes {

	public static int countNodes(TreeNode<Integer> root) {

		if (root == null)
			return 0;

		int count = 1;

		for (int i = 0; i < root.children.size(); i++) {
			count += countNodes(root.children.get(i));
		}

		return count;

	}

	public static void main(String... s) {

		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(countNodes(root));
	}

}
