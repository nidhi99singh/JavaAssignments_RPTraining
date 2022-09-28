import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {


		ArrayList<Student> list=new ArrayList<>();
		list.add(new Student("Anchal",2002,23,'A'));
		list.add(new Student("Nidhi",2005,25,'A'));
		list.add(new Student("Garima",2007,15,'C'));
		list.add(new Student("Rupal",2004,16,'B'));
		list.add(new Student("Mansi",2006,13,'B'));
		list.add(new Student("Manan",2009,13,'B'));
		list.add(new Student("Ronak",2010,16,'A'));
		list.add(new Student("Arul",2011,16,'D'));
	

		System.out.println("Students name starting with 'Man'");
		list.stream().filter(s->s.getStudentName().startsWith("Man"))
					.forEach(s->System.out.println(s.getStudentName()));

		System.out.println("Student details with name 'Anchal'");
		list.stream().filter(s->s.getStudentName().equals("Anchal")).forEach(s->System.out.println("student name: "+s.getStudentName()+",id: "+s.getStudentId()));
		
		//map method to get all student ids
		
		Set<Integer> result=list.stream().map(s->s.getStudentId()).collect(Collectors.toSet());
		System.out.println("id set: "+result);
		
		// students having garde A and age > 20
		list.stream().filter(s->s.getAge()>20)
				.filter(s->s.getGrade()=='A')
				.forEach(s->System.out.println("student name: "+s.getStudentName()+",age: "+s.getAge() +",grade:"+s.getGrade()));
		
	}

	
}
