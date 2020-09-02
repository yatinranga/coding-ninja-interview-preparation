package binary_search_tree;

import binary_tree.BinaryTreeNode;
import binary_tree.Pair;
import binary_tree.TakeInputLevelWise;

public class CheckIfBinaryTreeIsBSTApproach2 {

	public static Pair<Boolean, Pair<Integer, Integer>> isBST(BinaryTreeNode<Integer> root) {

		if (root == null) {
			Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
			output.first = true;
			output.second = new Pair<Integer, Integer>();
			output.second.first = Integer.MAX_VALUE;
			output.second.second = Integer.MIN_VALUE;
			return output;
		}

		Pair<Boolean, Pair<Integer, Integer>> leftOutput = isBST(root.left);
		Pair<Boolean, Pair<Integer, Integer>> rightOutput = isBST(root.right);

		int min = Math.min(root.data, Math.min(leftOutput.second.first, leftOutput.second.first));
		int max = Math.max(root.data, Math.max(leftOutput.second.second, leftOutput.second.second));

		boolean isBST = (root.data > leftOutput.second.second) && (root.data <= rightOutput.second.first)
				&& leftOutput.first && rightOutput.first;

		Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
		output.first = isBST;
		output.second = new Pair<Integer, Integer>();
		output.second.first = min;
		output.second.second = max;
		return output;

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(isBST(root).first);
	}

}
