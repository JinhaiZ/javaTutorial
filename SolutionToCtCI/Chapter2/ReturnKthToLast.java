package Chapter2;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class ReturnKthToLast {
	public static void printKthToLast(LinkedListNode head, int k){
		int len = 0;
		LinkedListNode n = head;
		while (n!=null) {
			len ++;
			n = n.next;
		}
		n = head;
		for (int i = 0; i< len; i++) {
			if (i == (len-k)) {
				System.out.println(k + "th to last node is "+n.data);
			}
			n = n.next;
		}
	}
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5, 6};
		LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
		for (int i = 0; i <= array.length + 1; i++) {
			printKthToLast(head, i);
		}
	}
	

}
/*
 * Space Complexity O(1) 
 * Time Complexity O(N) where N is the number of elements in the linked list
 * 
*/