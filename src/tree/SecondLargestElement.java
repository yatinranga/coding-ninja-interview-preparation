package tree;

public class SecondLargestElement {

	static class pair<T> {

		T first;
		T second;

		pair(T first, T second) {
			this.first = first;
			this.second = second;
		}
	}

	public static pair<TreeNode<Integer>> findSecondLargestHelper(TreeNode<Integer> root) {

		pair<TreeNode<Integer>> output;

		if (root == null) {
			output = new pair<TreeNode<Integer>>(null, null);
			return output;
		}

		output = new pair<TreeNode<Integer>>(root, null);

		for (TreeNode<Integer> child : root.children) {
			pair<TreeNode<Integer>> childPair = findSecondLargestHelper(child);

			if (childPair.first.data > output.first.data) {
				if (childPair.second == null || childPair.second.data < output.first.data) {
					output.second = output.first;
					output.first = childPair.first;
				} else {
					output.second = childPair.second;
					output.first = childPair.first;
				}
			} else if (childPair.first.data.equals(output.first.data) && childPair.second != null) {
				output.second = childPair.second;
			} else if (output.first.data != childPair.first.data
					&& (output.second == null || childPair.first.data > output.second.data)) {
				output.second = childPair.first;
			}
		}

		return output;

	}

	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {

		return findSecondLargestHelper(root).second;
	}

	public static void main(String[] args) {
		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(findSecondLargest(root).data);
	}

}
