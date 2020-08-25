package linkedlist;

import java.util.Scanner;

public class DeleteNodeInLL {

	static Scanner s = new Scanner(System.in);

	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int pos) {

		LinkedListNode<Integer> temp = head;

		if (pos == 0) {
			return head = head.next;
		}

		int i = 0;
		while (temp != null && i < pos - 1) {
			i++;
			temp = temp.next;
		}

		if (temp == null || temp.next == null)
			return head;

		temp.next = temp.next.next;

		return head;

	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = LinkedListNode.takeInput();
		int pos = s.nextInt();
		deleteIthNode((head), pos);
	}

}
