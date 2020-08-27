package tree;

public class CountLeafNodes {

	public static int countLeafNodes(TreeNode<Integer> root) {

		if (root == null) {
			return 0;
		}

		int leaf = 0;

		if (root.children.isEmpty()) {
			return 1;
		}

		for (int i = 0; i < root.children.size(); i++) {
			leaf += countLeafNodes(root.children.get(i));
		}

		return leaf;

	}

	public static void main(String[] args) {
		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(countLeafNodes(root));
	}

}
