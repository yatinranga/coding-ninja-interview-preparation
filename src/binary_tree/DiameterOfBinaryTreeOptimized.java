package binary_tree;

public class DiameterOfBinaryTreeOptimized {

	public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root) {

		if (root == null) {
			Pair<Integer, Integer> output = new Pair<Integer, Integer>();
			output.first = 0;
			output.second = 0;
			return output;
		}

		Pair<Integer, Integer> lo = heightDiameter(root.left);
		Pair<Integer, Integer> ro = heightDiameter(root.right);
		int height = 1 + Math.max(lo.first, ro.first);
		int opt1 = lo.first + ro.first;
		int opt2 = lo.second;
		int opt3 = ro.second;
		int diameter = Math.max(opt1, Math.max(opt2, opt3));
		Pair<Integer, Integer> output = new Pair<Integer, Integer>();
		output.first = height;
		output.second = diameter;
		return output;

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		Pair<Integer, Integer> pair = heightDiameter(root);

		System.out.println("height : " + pair.first);
		System.out.println("diameter : " + pair.second);
	}

}
