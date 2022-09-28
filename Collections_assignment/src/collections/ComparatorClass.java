//2.  Write a program to sort ArrayList using Comparable and Comparator.

package collections;

import java.util.Comparator;

public class ComparatorClass implements Comparator<EmployeeComparator>{

	@Override
	public int compare(EmployeeComparator employee1, EmployeeComparator employee2) {
		
		String name1=employee1.getEmployeeName().toLowerCase();
		String name2=employee2.getEmployeeName().toLowerCase();
		return name2.compareTo(name1); 
	}
}