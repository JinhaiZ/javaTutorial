package chapter7;

import java.util.LinkedList;

public class StackL<T> {
	private LinkedList<T> list = new LinkedList<T>();
	public void push(T t) {
		list.addFirst(t);
	}
	public Object top() {
		return list.getFirst();
	}
	public Object pop() {
		return list.removeFirst();
	}
	public static void main(String args[]) {
		StackL<String> s = new StackL<String>();
		s.push("Kevin");
		s.push("Lisa");
		s.push("Adele");
		s.pop();
		System.out.println(s.top());
	}
}
