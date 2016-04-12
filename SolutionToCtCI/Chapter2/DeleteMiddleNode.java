package Chapter2;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class DeleteMiddleNode {
	//assume have access to the head node
	public static void deleteMiddleNode(LinkedListNode head) {
		LinkedListNode current = head;
		LinkedListNode runner = head;
		LinkedListNode prev = head;
		int index = 0;
		while (current.next != null) {
			current = current.next;
			index ++;
			if (index%2 == 0 ) {
				prev = runner;
				runner = runner.next;
			}
		}
		prev.next = runner.next;
	}
	
	public static void main(String[] args) {
		LinkedListNode head = AssortedMethods.randomLinkedList(10, 0, 10);
		System.out.println(head.printForward());
		deleteMiddleNode(head); // delete node 4
		System.out.println(head.printForward());
	}
}
/*
 * Space Complexity O(1) 
 * Time Complexity O(N) where N is the number of elements in the linked list
 * 
*/