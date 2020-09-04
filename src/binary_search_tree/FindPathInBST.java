package binary_search_tree;

import java.util.ArrayList;
import java.util.Scanner;

import binary_tree.BinaryTreeNode;
import binary_tree.TakeInputLevelWise;

public class FindPathInBST {

	public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root, int data) {

		if (root == null)
			return null;

		if (root.data == data) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		}
		if (root.data > data) {
			ArrayList<Integer> leftOutput = new ArrayList<Integer>();
			leftOutput = findPath(root.left, data);
			if (leftOutput != null) {
				leftOutput.add(root.data);
				return leftOutput;
			}

		}
		if (root.data < data) {
			ArrayList<Integer> rightOutput = new ArrayList<Integer>();
			rightOutput = findPath(root.right, data);
			if (rightOutput != null) {
				rightOutput.add(root.data);
				return rightOutput;
			} else
				return null;
		} else
			return null;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the node you want to search : ");
		int data = scan.nextInt();
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		ArrayList<Integer> list = findPath(root, data);
		System.out.println(list);

	}

}
