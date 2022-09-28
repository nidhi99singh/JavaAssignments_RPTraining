import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filters1 {

	public static void main(String [] args) {
		
		ArrayList<String> list=new ArrayList<>();
		list.add("Anchal");
		list.add("Pooja");
		list.add("Mansi");
		list.add("Nidhi");
		list.add("Sonali");
		list.add("Aman");
		list.add("Rupal");
		
		ArrayList<Integer> numbersList=new ArrayList<>();
		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(3);
		numbersList.add(4);
		numbersList.add(5);
		
//		Iterator itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//1. filter method
		List<String> results=list.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
		Iterator itr1=results.iterator();
		System.out.println("names starting with A");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		//2. sorting list
		List<String> result1=list.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted list:"+result1);
		
		//3. map method		
		Set<Integer> result2=numbersList.stream().map(n->n*n).collect(Collectors.toSet());
		System.out.println(result2);
	
		//reduce method
		System.out.println("printing square of numbers using map() and forEach()");
		numbersList.stream().map(n->n*n).forEach(y->System.out.println(y));
		
		//printing even squares
		System.out.println("printing even squares");
		numbersList.stream().map(n->n*n).filter(x->x%2==0).forEach(y->System.out.println(y));;
	}
}
