package Chapter1;
/*
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures ?
 */
public class IsUnique {
	public static boolean isUnique(String word) {
		if(word.length() > 128)
			return false;
		boolean flag[] = new boolean[128];
		int counter = 0;
		for (int i = 0; i < word.length(); i++) {
			int index = word.charAt(i); 
			flag[index] = true; 
		}
		for (int i = 0; i < 128; i++) {
			if (flag[i] == true)
				counter ++;
		}
		if (counter == word.length())
			return true;
		else
			return false;
	}
	public static void main(String Args[]) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUnique(word));
		}
	}
}
/*
 * Space Complexity O(1)
 * Time Complexity O(1)
 * 
 * ASCII code range from 0 to 127
 * Extended ASCII code range from 0 to 255
 * Convert ASCII code to Character
 * int i = 169; char s = Character.toString((char)i);
 * Convert Character to ASCII code
 * char c = '�'; int i = c;
*/
