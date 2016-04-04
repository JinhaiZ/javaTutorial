package chapter7;
import java.util.Comparator;

public class DescComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Comparable c1 = (Comparable) o1;
		return 0 - c1.compareTo(o2);
	}

}
