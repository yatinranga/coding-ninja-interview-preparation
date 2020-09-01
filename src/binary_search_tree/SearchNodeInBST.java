package binary_search_tree;

import java.util.Scanner;

import binary_tree.BinaryTreeNode;
import binary_tree.TakeInputLevelWise;

public class SearchNodeInBST {

	public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root, int data) {

		if (root == null)
			return null;

		if (root.data == data) {
			return root;
		}

		if (data < root.data) {
			root = searchInBST(root.left, data);
		} else {
			root = searchInBST(root.right, data);
		}

		return root;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the node you want to search : ");
		int data = scan.nextInt();

		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		root = searchInBST(root, data);
		if (root != null) {
			System.out.println("data found : " + root.data);
		} else {
			System.out.println("data not found");
		}
		scan.close();

	}

}
