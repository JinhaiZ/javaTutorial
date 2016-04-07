package chapter3;

public class AppendStringTest {
	public static void main(String[] args) {
		String text = " ";
		long beginTime = System.currentTimeMillis();
		for (int i =0; i < 1000;i ++) {
			text = text + i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Run time: "+ (endTime - beginTime));

		StringBuilder builder = new StringBuilder(" ");
		beginTime = System.currentTimeMillis();
		for (int i =0; i < 1000;i ++) {
			builder.append(String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println("Run time: "+ (endTime - beginTime));
	}
}
