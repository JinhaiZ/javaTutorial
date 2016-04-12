package Chapter2;

import java.util.*;

import CtCILibrary.LinkedListNode;

public class RemoveDups {
	public static void removeDups(LinkedListNode node) {
		HashSet<Integer> dups = new HashSet<Integer>();
		dups.add(node.data);
		node = node.next;
		LinkedListNode priv = node;
		while (node != null) {
			if (dups.contains(node.data)) {
				priv.next = node.next;
			} else {
				dups.add(node.data);
				priv = node;
			}
			node = node.next;
		}
	}
	
	public static void main(String[] args) {	
		LinkedListNode first = new LinkedListNode(0, null, null); //AssortedMethods.randomLinkedList(1000, 0, 2);
		LinkedListNode head = first;
		LinkedListNode second = first;
		for (int i = 1; i < 15; i++) {
			second = new LinkedListNode(i % 4, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
		}
		System.out.println(head.printForward());
		removeDups(head);
		System.out.println(head.printForward());
	}
}
