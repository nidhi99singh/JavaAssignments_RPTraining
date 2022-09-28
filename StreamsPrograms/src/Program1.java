//varargs program

public class Program1 {

	public static void main(String[] args) {
		
		String name1="Nidhi";
		String name2="Pooja";
		String name3="Mansi";
		String name4="Ronak";
		printList(name1,name2,name3);
	}
	
	public static void printList(String... names ) {
		System.out.println("names list:");
		for(String name: names) {
			System.out.println(name);
		}
	}
}
