//9.  Write a program to iterate TreeMap in java.

package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String [] args) {
	
		TreeMap<Integer,String> map1=new TreeMap<Integer, String>();
		map1.put(1,"Nidhi");
		map1.put(5,"Pooja");
		map1.put(2,"Mansi");
		map1.put(10,"Ronak");
		map1.put(3,"Keshav");
		map1.put(15,"Sonali");
		
		System.out.println(map1);
		
		Iterator<Map.Entry<Integer, String>> itr=map1.entrySet().iterator();
		
		System.out.println("Map using Iterator");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
