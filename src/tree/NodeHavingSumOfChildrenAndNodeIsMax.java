package tree;

public class NodeHavingSumOfChildrenAndNodeIsMax {

	static class MaxNodePair<T> {
		TreeNode<T> node;
		int sum;
	}

	public static MaxNodePair<Integer> maxSumNodeHelper(TreeNode<Integer> root) {

		if (root == null) {
			MaxNodePair<Integer> pair = new MaxNodePair<Integer>();
			pair.node = root;
			pair.sum = Integer.MIN_VALUE;
			return pair;
		}

		int sum = root.data;
		for (TreeNode<Integer> child : root.children) {
			sum += child.data;
		}

		MaxNodePair<Integer> ans = new MaxNodePair<Integer>();
		ans.node = root;
		ans.sum = sum;

		for (TreeNode<Integer> child : root.children) {
			MaxNodePair<Integer> childAns = maxSumNodeHelper(child);
			if (childAns.sum > ans.sum) {
				ans = childAns;
			}
		}

		return ans;
	}

	public static TreeNode<Integer> nodeHavingSumOfChildrenAndNodeIsMax(TreeNode<Integer> root) {

		return maxSumNodeHelper(root).node;

	}

	public static void main(String[] args) {
		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(nodeHavingSumOfChildrenAndNodeIsMax(root).data);
	}

}
