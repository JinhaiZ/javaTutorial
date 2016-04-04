package chapter7;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Comparable {
	int id;
	String name;
	//When we call Array.sort() method, it can use
	//compareTo method to compare the Employee class
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.id - e.id;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "id =" + this.id + " name is " + this.name;
	}
	
	public static void main(String args[]) {
		Employee employeeList[] = new Employee[] {
				new Employee(004,"Kevin"), 
				new Employee(001,"Lisa"),
				new Employee(002,"Adele"),
				new Employee(003,"Bob"),
				new Employee(000,"Cedric")
				};
		Arrays.sort(employeeList);
		for (int i = 0; i < employeeList.length; i++) {
			System.out.println(employeeList[i]);
		}
	}
}
