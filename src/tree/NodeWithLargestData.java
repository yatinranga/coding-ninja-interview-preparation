package tree;

public class NodeWithLargestData {

	public static int nodeWithLargestData(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int largest = root.data;

		for (int i = 0; i < root.children.size(); i++) {
			int tempLarge = nodeWithLargestData(root.children.get(i));
			largest = tempLarge > largest ? tempLarge : largest;
		}

		return largest;

	}

	public static void main(String... s) {

		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(nodeWithLargestData(root));
	}
}
