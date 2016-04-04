package chapter7;

public class TestEnum {
	public enum Student { WAKEUP, EATING, STUDYING, SLEEPING };
	private static void studentState (Student s) {
		switch(s) {
		case WAKEUP:
			System.out.println("Student wakes up");break;
		case EATING:
			System.out.println("Student is eating");break;
		case STUDYING:
			System.out.println("Student is studying");break;
		case SLEEPING:
			System.out.println("Student is sleeping");break;
		default:
			System.out.println("default");
		}
	}
	public static void main(String args[]) {
		TestEnum.studentState(Student.SLEEPING);
	}
}
