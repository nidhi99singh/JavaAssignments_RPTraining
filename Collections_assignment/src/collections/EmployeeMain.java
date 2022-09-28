package collections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain{

	public static void main(String[] args) {

		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"Nidhi","Developer",25));
		list.add(new Employee(106,"Mansi","Developer",35));
		list.add(new Employee(66,"Neha","Developer",20));
		
		System.out.println("******employee details before sorting******");
		for(Employee e:list) {
			e.display();
		}
		
		Collections.sort(list);
		System.out.println("\n******employee details after sorting******\n descending order of id");
		for(Employee e:list) {
			e.display();
		}
	}
}
