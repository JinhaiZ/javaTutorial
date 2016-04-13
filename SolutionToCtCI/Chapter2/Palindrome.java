package Chapter2;

import CtCILibrary.LinkedListNode;

public class Palindrome {
	/*assume input linked list is a double linked list*/
	public static boolean isPalindrome (LinkedListNode head) {
		LinkedListNode tail = head;
		while (tail.next != null) {
			tail = tail.next;
		}
		while (head!= null) {
			if (tail.data != head.data) {
				return false;
			}
			tail = tail.prev;
			head = head.next;
		}
		return true;
	}
	public static void main(String[] args) {
		int length = 9;
		LinkedListNode[] nodes = new LinkedListNode[length];
		for (int i = 0; i < length; i++) {
			nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
		}
		
		for (int i = 0; i < length; i++) {
			if (i < length - 1) {
				nodes[i].setNext(nodes[i + 1]);
			}
			if (i > 0) {
				nodes[i].setPrevious(nodes[i - 1]);
			}
		}
		// nodes[length - 2].data = 9; // Uncomment to ruin palindrome
		
		LinkedListNode head = nodes[0];
		System.out.println(head.printForward());
		System.out.println(isPalindrome(head));
	}
}
/*
 * Space Complexity O(1) 
 * Time Complexity O(N) where N is the number of elements in the linked list
 * 
*/