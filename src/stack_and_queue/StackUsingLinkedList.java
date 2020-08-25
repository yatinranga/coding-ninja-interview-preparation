package stack_and_queue;

public class StackUsingLinkedList<T> {

	private Node<T> head;
	private int size;

	public StackUsingLinkedList() {
		this.head = null;
		this.size = 0;
	}

	public int size() {
		return size;
	}

	public T top() {
		if (head != null)
			return head.data;
		else
			return null;
	}

	public boolean isEmpty() {
		return head == null ? true : false;
	}

	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public T pop() {

		if (head == null)
			return null;
		else {
			T temp = head.data;
			head = head.next;
			size--;
			return temp;
		}

	}

}
