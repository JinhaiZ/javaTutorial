package chapter7;
import java.util.Comparator;

public class DescComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		Comparable<Employee> c1 = (Comparable<Employee>) o1;
		return 0 - c1.compareTo(o2);
	}

}
