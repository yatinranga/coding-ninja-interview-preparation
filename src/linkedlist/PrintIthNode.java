package linkedlist;

import java.util.Scanner;

public class PrintIthNode {

	static Scanner s = new Scanner(System.in);

	public static void ithNode(LinkedListNode<Integer> head, int i) {

		if (i == 0)
			System.out.println(head.data);
		;

		if (head == null)
			System.out.println();

		ithNode(head.next, --i);
	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = LinkedListNode.takeInput();
		int pos = s.nextInt();
		ithNode((head), pos);
	}

}
