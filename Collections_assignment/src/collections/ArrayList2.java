//sorting arraylist in descending order using sort and reverse order methods

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList2 {

	public static void main(String [] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(45);
		list.add(22);
		list.add(6);
		System.out.println("adding elements: "+list);
		
		//reverse of array list
		Collections.reverse(list);
		System.out.println("reverse of ArrayList: "+list);
		
		//sorting arrayList
		Collections.sort(list);
		System.out.println("after sort(): "+list);
		
		//reversing array list
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("after reverseOrder(): "+list);
	}
}
