package Chapter1;

public class OneWay {
	/* Assumes input is ASCII*/
	public static boolean isReplace(char[] c1, char[] c2){
		boolean flag = false;
		for(int i = 0; i < c1.length; i++) {
			if(c1[i]!=c2[i]) {
				if (flag)
					return false;
				flag = true;
			}
		}
		return true;
	}
	
	public static boolean isInRm(char[] c1, char[] c2){
		boolean flag = false;
		int j = 0;
		for(int i = 0; i < c2.length; i++) {
			if(c1[i+j]!=c2[i]) {
				if(flag)
					return false;
				flag = true;
				j=1;
				}
			}
		return true;
	}

	public static boolean isOneWay(String s1, String s2) {
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		int len1 = c1.length;
		int len2 = c2.length;
		if (len1 == len2) {
			return isReplace(c1,c2); 
		} else if (len1 == len2 + 1) {
			return isInRm(c1,c2);
		} else if (len2 == len1 + 1) {
			return isInRm(c2,c1);
		} 
		return false;
	}
	public static void main(String[] args) {
		String a = "palee";
		String b = "pale";
		boolean isOneEdit1 = isOneWay(a, b);
		System.out.println(a + ", " + b + ": " + isOneEdit1);

		String c = "pale";
		String d = "pkle";
		boolean isOneEdit2 = isOneWay(c, d);
		System.out.println(c + ", " + d + ": " + isOneEdit2);
	}
}
/*
 * Space Complexity O(N), N is the length of the string
 * Time Complexity O(N), N is the length of the string
 */