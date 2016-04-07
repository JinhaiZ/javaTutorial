package chapter3;

public class TestString {
	public static void main(String args[]) {
		//constructor
		String s1 = "Hello Java";
		String s2 = new String("Hello Java");
		char c[] = {'H','e','l','l','o',' ','j','a','v','a'};
		String s3 = new String(c);
		String s4 = new String(c,4,2);
		System.out.println(s1+"\n"+s2+"\n"+s3);
		// String is immutable 
		System.out.println(s2 == s1);
		System.out.println(s2.equals(s1));
		//charAt
		System.out.println(s1.charAt(0));
		//length
		System.out.println(s1.length());
		//indexOf, the first position of the Java in the string 
		System.out.println(s1.indexOf("Java"));
		//equalsIgnoreCase
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		//replace
		System.out.println(s1.replace("Java", "Python"));
		//ValueOf
		int i = 123456;
		String num = String.valueOf(i);
		System.out.println(num+" has "+num.length()+" bits");
		//split
		String s = "Kevin, Lisa, Adele, Bob";
		String [] sP = s.split(", ");
		for (String word: sP) System.out.println(word);
	}
	
	

}
