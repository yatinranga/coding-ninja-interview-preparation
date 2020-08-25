package linkedlist;

public class PalindromeLinkedList {

	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {

		LinkedListNode<Integer> head1 = head;
		int size = 0;

		while (head1 != null) {
			size++;
			head1 = head1.next;
		}

		int half = size / 2;

		head1 = head;

		for (int i = 0; i < half; i++) {
			head1 = head1.next;
		}

		LinkedListNode<Integer> previous = null;
		LinkedListNode<Integer> current = head1.next;
		LinkedListNode<Integer> next = null;

		while (current != null) {

			if (current.next == null) {
				current.next = previous;
				head1.next = current;
				current = current.next;
				break;
			}

			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}

		head1 = head1.next;

		while (head1 != null) {
			if (head.data == head1.data) {
				head = head.next;
				head1 = head1.next;
			} else
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = LinkedListNode.takeInput();
		System.out.println(isPalindrome_2(head));

	}

}
