package linkedlist;

import java.util.Scanner;

public class SwapTwoNodeOfLL {

	static Scanner scan = new Scanner(System.in);

	public static LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head, int x, int y) {
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> previous1 = null;
		LinkedListNode<Integer> previous2 = null;
		LinkedListNode<Integer> current1 = null;
		LinkedListNode<Integer> current2 = null;

		int greater = 0, smaller = 0;

		if (x > y) {
			greater = x;
			smaller = y;
		} else {
			greater = y;
			smaller = x;
		}

		for (int i = 0; i <= greater; i++) {

			if (i == (smaller - 1))
				previous1 = temp;

			if (i == smaller)
				current1 = temp;

			if (i == (greater - 1))
				previous2 = temp;

			if (i == greater) {
				current2 = temp;
				break;
			}
			temp = temp.next;
		}

		previous1.next = current2;
		previous2.next = current1;
		temp = current1.next;
		current1.next = current2.next;
		current2.next = temp;

		return head;
	}

	public static void print(LinkedListNode<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = LinkedListNode.takeInput();
		print(swap_nodes(head, scan.nextInt(), scan.nextInt()));
	}

}
