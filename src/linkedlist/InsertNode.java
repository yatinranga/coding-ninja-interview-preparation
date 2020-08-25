package linkedlist;

import java.util.Scanner;

public class InsertNode {

	static Scanner s = new Scanner(System.in);

	
//		RECURSIVE APPROACH
//	
//	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos){
//		
//        LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);
//        
//       if(pos == 0){
//           newNode.next = head;
//           head = newNode;
//           return head;
//       }
//        
//        if(head == null)
//            return head;
//        
//        if(pos == 1){
//            newNode.next = head.next;
//            head.next = newNode;
//        }else{
//        		insertR(head.next,data,--pos);
//        }
//        
//        return head;
//        
//	}
//	
//	
	
	public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head, int data, int pos) {

		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(data);

		if (pos == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}

		LinkedListNode<Integer> temp = head;
		int i = 0;

		while (temp != null && i < pos - 1) {
			i++;
			temp = temp.next;
		}

		if (temp == null) {
			return head;
		}

		if (i == pos - 1 && temp.next == null) {
			temp.next = newNode;
			return head;
		}

		newNode.next = temp.next;
		temp.next = newNode;
		return head;

	}

	public static void main(String[] args) {
		LinkedListNode<Integer> head = LinkedListNode.takeInput();
		int pos = s.nextInt();
		int data = s.nextInt();
		insert((head), data, pos);
	}

}
