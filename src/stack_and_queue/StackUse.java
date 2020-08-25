package stack_and_queue;

public class StackUse {

	public static void main(String[] args) {

		// STACK using Linked List

		StackUsingLinkedList<Integer> stackLL = new StackUsingLinkedList<Integer>();
		System.out.println(stackLL.isEmpty());
		System.out.println(stackLL.size());
		System.out.println(stackLL.pop());
		stackLL.push(10);
		System.out.println(stackLL.top());
		System.out.println(stackLL.isEmpty());
		System.out.println(stackLL.size());
		System.out.println(stackLL.pop());

	}

}
