package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorMain {

	public static void main(String[] args) {
	
		ArrayList<EmployeeComparator> list=new ArrayList<>();
		
		list.add(new EmployeeComparator(101,"Nidhi","Developer",25));
		list.add(new EmployeeComparator(105,"Anchal","engineer",55));
		list.add(new EmployeeComparator(60,"Pooja","Developer",22));
		list.add(new EmployeeComparator(110,"Keshav","Developer",37));
		
		System.out.println("********data before sorting*********");
		for(EmployeeComparator e:list) {
			e.display();
		}
		
		System.out.println("\n *********data after sorting(based on name)******** ");
		Collections.sort(list,new ComparatorClass());
		for(EmployeeComparator e:list) {
			e.display();
		}
		
	}

}
