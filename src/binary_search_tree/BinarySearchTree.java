package binary_search_tree;

import java.util.LinkedList;
import java.util.Queue;

import binary_tree.BinaryTreeNode;

public class BinarySearchTree {

	private BinaryTreeNode<Integer> root;

	private boolean hasDataHelper(BinaryTreeNode<Integer> root, int data) {

		if (root == null)
			return false;

		if (root.data == data) {
			return true;
		} else if (data > root.data) {
			return hasDataHelper(root.right, data);
		} else {
			return hasDataHelper(root.left, data);
		}
	}

	private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data) {

		if (root == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			return newNode;
		}

		if (data > root.data) {
			root.right = insertHelper(root.right, data);
		} else {
			root.left = insertHelper(root.left, data);
		}

		return root;
	}

	private void printTreeHelper(BinaryTreeNode<Integer> root) {
		if (root == null)
			return;

		Queue<BinaryTreeNode<Integer>> pendingQueue = new LinkedList<BinaryTreeNode<Integer>>();

		pendingQueue.add(root);

		while (!pendingQueue.isEmpty()) {
			int n = pendingQueue.size();

			while (n != 0) {

				BinaryTreeNode<Integer> front = pendingQueue.poll();
				String toBePrinted = front.data + ":";

				if (front.left != null) {
					toBePrinted = toBePrinted + "L:" + front.left.data + ",";
					pendingQueue.add(front.left);
				}
				if (front.right != null) {
					toBePrinted = toBePrinted + "R:" + front.right.data;
					pendingQueue.add(front.right);
				}

				System.out.println(toBePrinted);
				n--;
			}
		}

	}

	private BinaryTreeNode<Integer> deleteHelper(BinaryTreeNode<Integer> root, int data) {

		if (root == null)
			return null;

		if (data > root.data) {
			root.right = deleteHelper(root.right, data);
			return root;
		} else if (data < root.data) {
			root.left = deleteHelper(root.left, data);
			return root;
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				BinaryTreeNode<Integer> minNode = root.right;
				while (minNode.left != null) {
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = deleteHelper(root.right, minNode.data);
				return root;
			}
		}

	}

	public BinaryTreeNode<Integer> delete(int data) {
		root = deleteHelper(root, data);
		return root;
	}

	public void printTree() {
		printTreeHelper(root);
	}

	public void insert(int data) {

		if (data < 0) {
			return;
		}

		root = insertHelper(root, data);
	}

	public boolean hasData(int data) {

		return hasDataHelper(root, data);

	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(10);
		bst.insert(20);
		bst.insert(5);
		bst.insert(15);
		bst.insert(3);
		bst.insert(7);
		bst.printTree();
		bst.delete(10);
		System.out.println();
		bst.printTree();

	}

}
