//sorting arrayList in descending order( using loops)
//1.  Write a program to sort ArrayList in descending order.
//3.  Write a program to add element at particular index of ArrayList.
//8.  Write a program to reverse ArrayList in java.
//10. Write a program to remove element from specified index of ArrayList.

package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
	
	public static void sortArrayList(ArrayList<Integer> arrayList) {
		Iterator itr=arrayList.iterator();
		
		//sorting ArrayList in descending order		
		while(itr.hasNext()) {
			for(int i=0;i<arrayList.size()-1;i++) {
				if(i==arrayList.size()) {
					System.out.println("1");
					break;
				}else {
					int x=arrayList.get(i);
					int y=arrayList.get(i+1);
					if(x<y) {
						int temp=x;
						arrayList.set(i,y);
						arrayList.set(i+1, temp);
					}	
				}				
			}
			itr.next();
		}
		System.out.println("Arraylist after sorting : "+arrayList);			
	}
	
	public static void reverseArrayList(ArrayList<Integer> arrayList) {
		
		int x=arrayList.size()-1;
		int y=0;
		ArrayList<Integer> newList=new ArrayList<>(x);
			for(int i=x;i>=0;i--) {
				int element=arrayList.get(i);
				newList.add(y, element);
				y++;
			}	
		System.out.println("reversed arrayList: "+newList);
	}

	public static void main(String [] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(23);
		list.add(12);
		list.add(8);
		list.add(40);
		list.add(30);
		list.add(1);
		System.out.println("ArrayList :"+list);
		
//		//adding element at index 3.
		list.add(3, 100);
		System.out.println("adding element at index 3: "+list);

		//reverse arrayList
		reverseArrayList(list);
		
		//sorting arraylist in descending order.
		sortArrayList(list);
	
//		//remove element from specified index..		
		list.remove(5);
		System.out.println("after removal: "+list);	
		}
}
