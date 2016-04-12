package Chapter2;

import CtCILibrary.AssortedMethods;
import CtCILibrary.LinkedListNode;

public class ReturnKthToLastRecursive {
	public static int returnKthToLastRecursive(LinkedListNode head, int k){
		if (head == null) {
			return 0;
		} else {
			int index = returnKthToLastRecursive(head.next, k) + 1;
			if (index == k )
				System.out.println(index+": "+head.data);
			return index;
		}

	}
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3, 4, 5, 6};
		LinkedListNode head = AssortedMethods.createLinkedListFromArray(array);
		for (int i = 0; i <= array.length + 1; i++) {
			returnKthToLastRecursive(head,i);
		}
	}
}
/*
 * Space Complexity O(N) 
 * Time Complexity O(N) where N is the number of elements in the linked list
 * 
*/