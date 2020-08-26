package tree;

public class SumOfNodes {

	public static int sumOfNodes(TreeNode<Integer> root) {

		if (root == null)
			return 0;

		int sum = root.data;

		for (int i = 0; i < root.children.size(); i++) {
			sum += sumOfNodes(root.children.get(i));
		}

		return sum;
	}

	public static void main(String... s) {

		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(sumOfNodes(root));
	}

}
