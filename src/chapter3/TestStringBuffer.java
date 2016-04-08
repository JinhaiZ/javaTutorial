package chapter3;

public class TestStringBuffer {
	public static void main(String args[]) {
		String s = "Kevin and Lisa"; 
		StringBuffer sb1 = new StringBuffer(s);
		System.out.println(sb1);
		// append
		sb1.append(" work together");
		System.out.println(sb1);
		// insert
		sb1.insert(14, " and Adele");
		System.out.println(sb1);
		// delete
		sb1.delete(14, 24);
		System.out.println(sb1);
		// reverse
		sb1.reverse();
		System.out.println(sb1);
	}

}
