package chapter7;

import java.util.LinkedList;

public class StackL {
	private LinkedList list = new LinkedList();
	public void push(Object o) {
		list.addFirst(o);
	}
	public Object top() {
		return list.getFirst();
	}
	public Object pop() {
		return list.removeFirst();
	}
	public static void main(String args[]) {
		StackL s = new StackL();
		s.push("Kevin");
		s.push("Lisa");
		s.push("Adele");
		s.pop();
		System.out.println(s.top());
	}
}
