package binary_search_tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import binary_tree.BinaryTreeNode;
import binary_tree.TakeInputLevelWise;

/**
 * Given a binary tree and an integer S, print all the pair of nodes whose sum
 * equals S. Assume binary tree contains all unique elements. Note : In a pair,
 * print the smaller element first. Order of different pair doesn't matter.
 * Input format :
 * 
 * Line 1 : Elements in level order form (separated by space) (If any node does
 * not have left or right child, take -1 in its place) Line 2 : Integer S
 * 
 * Output Format :
 * 
 * Each pair in different line (pair elements separated by space)
 * 
 * Constraints : 1 <= N <= 1000 Sample Input 1:
 * 
 * 5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1 15
 * 
 * Sample Output 1:
 * 
 * 5 10 6 9
 * 
 * 
 * @author Anonymous
 *
 */

public class PairSumBinaryTree {

	public static List<Integer> nodesSumToSHelper(BinaryTreeNode<Integer> root, int sum, List<Integer> list) {

		if (root == null)
			return null;

		list.add(root.data);
		nodesSumToSHelper(root.left, sum, list);
		nodesSumToSHelper(root.right, sum, list);

		return list;
	}

	public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
		List<Integer> list = new ArrayList<Integer>();
		list = nodesSumToSHelper(root, sum, list);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer iterate : list) {
			int remaining = sum - iterate;
			if (map.containsKey(remaining) && map.get(remaining) > 0) {
				System.out.println(remaining + " " + iterate);
				map.put(remaining, map.get(remaining) - 1);
				continue;
			}
			{
				map.put(iterate, 1);
			}

		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the sum : ");
		int sum = scan.nextInt();
		BinaryTreeNode<Integer> root = TakeInputLevelWise.takeInputLevelWise();
		nodesSumToS(root, sum);
		scan.close();

	}

}
