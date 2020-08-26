package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {

	public static TreeNode<Integer> takeInputLevelWise() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter root data");
		int rootData = scan.nextInt();
		Queue<TreeNode<Integer>> pendingQueue = new LinkedList<TreeNode<Integer>>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingQueue.add(root);

		while (!pendingQueue.isEmpty()) {

			TreeNode<Integer> frontNode = pendingQueue.poll();

			if (frontNode == null)
				return null;

			System.out.println("enter number of children of " + frontNode.data);
			int numChildren = scan.nextInt();

			for (int i = 0; i < numChildren; i++) {

				System.out.println(String.format("Enter %dth child of %d ", (i + 1), frontNode.data));
				int child = scan.nextInt();
				TreeNode<Integer> childNode = new TreeNode<Integer>(child);
				frontNode.children.add(childNode);
				pendingQueue.add(childNode);

			}
		}
		scan.close();
		return root;

	}

	public static void printTree(TreeNode<Integer> root) {

		if (root == null)
			return;

		String s = root.data + ": ";

		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ", ";
		}

		System.out.println(s);

		for (int i = 0; i < root.children.size(); i++) {
			printTree(root.children.get(i));
		}
	}

	public static void main(String... s) {

		TreeNode<Integer> root = takeInputLevelWise();
		printTree(root);
	}

}
