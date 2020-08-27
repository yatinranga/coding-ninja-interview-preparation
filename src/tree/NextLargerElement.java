package tree;

import java.util.Scanner;

public class NextLargerElement {

//	public static Set<Integer> nextLargestElement(TreeNode<Integer> root, int n, Set<Integer> set) {
//
//		if (root == null)
//			return null;
//
//		set.add(root.data);
//
//		for (int i = 0; i < root.children.size(); i++) {
//			nextLargestElement(root.children.get(i), n, set);
//		}
//
//		return set;
//	}
//
//	public static Integer findNextLargestNode(TreeNode<Integer> root, int n) {
//		Set<Integer> set = new TreeSet<Integer>();
//		set = nextLargestElement(root, n, set);
//
//		for (Integer i : set) {
//			if (i > n)
//				return i;
//		}
//
//		return null;
//
//	}
//	

	public static TreeNode<Integer> findNextLargestNode(TreeNode<Integer> root, int n) {

		if (root == null) {
			return root;
		}

		TreeNode<Integer> ans = new TreeNode<Integer>(null);

		if (root.data > n) {
			ans = root;
		}

		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> temp = findNextLargestNode(root.children.get(i), n);
			if (ans == null || temp.data > n && ans.data > temp.data) {
				ans = temp;
			}
		}

		return ans;

	}

	public static void main(String[] args) {
		System.out.println("Enter the element");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		TreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		System.out.println(findNextLargestNode(root, n).data);

	}

}
