//5.  Write a program to iterate the HashMap.
//sorting hashmap

package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<>();
		map.put(67,"Keshav");
		map.put(100,"Nidhi");
		map.put(30,"Mansi");
		map.put(45,"Pooja");
		System.out.println("map before sorting"+map);
		
		TreeMap<Integer, String> sorted=new TreeMap<>(map);
		System.out.println("Sorted Hashmap : "+sorted);

		for(Map.Entry m:map.entrySet()) {		
			System.out.println("key:"+m.getKey()+" | value:"+m.getValue());
		}
	}
	}

