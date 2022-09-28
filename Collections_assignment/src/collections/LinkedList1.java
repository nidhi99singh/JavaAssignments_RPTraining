//6.  Write a program to convert LinkedList to ArrayList.

package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String [] args) {
		
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("Pooja");
		linkedList.add("Mansi");
		linkedList.add("Nidhi");
		linkedList.add("Anchal");
		
		System.out.println("LinkedList: "+linkedList);
		
		ArrayList<String> arrayList=new ArrayList<>(linkedList);
		System.out.println("arrayList: "+arrayList);
	}
}
