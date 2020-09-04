package binary_search_tree;

import java.util.LinkedList;

import binary_tree.BinaryTreeNode;
import binary_tree.TakeInputLevelWise;

public class BSTToSortedLinkedList {

	public static LinkedList<Integer> BSTToSortedLLHelper(BinaryTreeNode<Integer> root, LinkedList<Integer> head) {

		if (root == null)
			return null;

		BSTToSortedLLHelper(root.left, head);
		head.add(root.data);
		BSTToSortedLLHelper(root.right, head);

		return head;
	}

	public static LinkedList<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root) {

		LinkedList<Integer> head = new LinkedList<Integer>();
		BSTToSortedLLHelper(root, head);
		return head;

	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		LinkedList<Integer> head = BSTToSortedLL(root);

		for (Integer iterate : head) {
			System.out.print(iterate + " ");
		}

	}

}
