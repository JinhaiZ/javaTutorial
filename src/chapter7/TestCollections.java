package chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestCollections {
	public static void main(String args[]) {
		double array[] = {9.1, 3, 5.5, 7, 1.2};
		double array2[] = {2, 4, 6, 8, 10.1};
		List<Double> list = new ArrayList<Double>();
		List<Double> list2 = new ArrayList<Double>();
		for (int i = 0; i < array.length; i++) {
			list.add(new Double (array[i]));
		}
		for(int i = 0; i< array2.length; i++) {
			list2.add(new Double (array2[i]));
		}
		// sort
		Collections.sort(list);
		System.out.println("List 1: sort");
		for (Iterator<Double> it = list.iterator(); it.hasNext();) {	
			System.out.print(it.next()+ ", ");
		}
		// shuffle
		Collections.shuffle(list2);
		System.out.println("\nList 2: shuffle");
		for (Iterator<Double> it = list2.iterator(); it.hasNext();) {
			System.out.print(it.next()+", ");
		}
		//binarySearch
		// a good use case
		int pos1 = Collections.binarySearch(list, new Double(5.5));
		System.out.print("\nThe postition of 5.5 in list1 is "+pos1);
		// a wrong use case, before use binarySearch, list should
		// be sorted, or it will return a wrong answer
		int pos2 = Collections.binarySearch(list2, new Double(4.0));
		System.out.print("\nThe postition of 4.0 in list1 is "+pos2);
		// reverse, reverse is not sort in reverse!
		Collections.reverse(list2);
		System.out.println("\nList 2: reverse");
		for (Iterator<Double> it = list2.iterator(); it.hasNext();) {
			System.out.print(it.next()+", ");
		}
		// copy dst src
		Collections.copy(list, list2);
		System.out.println("\nlist2 copies to list1, now list1 is");
		for (Iterator<Double> it = list.iterator(); it.hasNext();) {
			System.out.print(it.next()+", ");
		}		
	}
}
