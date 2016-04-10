package Chapter1;

public class PalindromePermuation {
	public static boolean isEven(int i) {
		if (i%2 == 0)
			return true;
		else
			return false;
	}
	/* Assumes only letters a through z. */
	public static int[] collect(String str) {
		str = str.toLowerCase();
		int c[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 'a' ;
			if ((index >=0 )&&(index <26))
				c[index] ++;
		}
		return c;
	}
	public static int trueLength(int[] c) {
		if ((c.length < 0)||(c.length > 26))
			return -1;
		int count = 0;
		for (int i =0; i < 26; i++) {
			count = count + c[i];
		}
		return count;
	}
	public static boolean isEvenString(int[] c) {
		if ((c.length < 0)||(c.length > 26))
			return false;
		
		for (int i = 0; i < 26; i++) {
			if (!isEven(c[i]))
				return false;
		}
		return true;
	}
	public static boolean isOddString(int[] c) {
		int odd = 0;
		if ((c.length < 0)||(c.length > 26))
			return false;
		for (int i = 0; i < 26; i++) {
			if (!isEven(c[i]))
				odd++;
		}
		if (odd == 1)
			return true;
		else
			return false;
	}
	public static boolean isPalindromePermuation (String str) {
		int c[] = collect(str);
		int len = trueLength(c);
		if (isEven(len))
			return isEvenString(c);
		else
			return isOddString(c);
	}
	
	public static void main(String[] args) {
		String pali = "Ratzs live on no evil starz";
		System.out.println(isPalindromePermuation(pali));
		String pali2 = "Zeus was deified, saw Suez";
		System.out.println(isPalindromePermuation(pali2));
	}
}
