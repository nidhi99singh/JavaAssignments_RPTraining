//7.  Write a program to convert HashSet to Array.

package collections;
import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		
	HashSet<String> hashSet=new HashSet<>();
	hashSet.add("Nidhi");
	hashSet.add("Aman");
	hashSet.add("Priya");
	hashSet.add("Bhumi");
	hashSet.add("Pooja");
	
	System.out.println("HashSet : "+hashSet);
	
	String array []=new String[hashSet.size()];
	System.out.println(array);
	hashSet.toArray(array);
	System.out.println("hashset converted to array : ");
	for(String a:array) {
		System.out.println(a);
	}
	
//	ArrayList<String> arrayList=new ArrayList<>(hashSet);
//	System.out.println("ArrayList : "+arrayList);
	
	}

}
