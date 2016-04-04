package chapter7;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String args[]) {
		// First way to declare an ArrayList
		ArrayList a = new ArrayList();
		// add elements to ArrayList a
		a.add("Adele");
		a.add("bob");
		a.add("Cedric");
		a.add("Kevin");
		a.add("Lisa");
		// remove elements in ArrayList a
		a.remove(0);
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println(a.get(0)+" at "+a.lastIndexOf(a.get(0)));
		// Second way to declare an ArrayList
		ArrayList b = new ArrayList(a);
		for (int i = 0; i < b.size(); i++) {
			System.out.println(b.get(i));
		}
		// add element at the end of the ArrayList
		b.add("adele");
		// add element at a specific location of the ArrayList
		b.add(0, "Adele");
		// better to use List as reference type when 
		// declaring an ArrayList class
		List c = new ArrayList(b);
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.get(i));
		}
	}
}
