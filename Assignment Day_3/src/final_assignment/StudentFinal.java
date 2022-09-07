package final_assignment;

public class StudentFinal {

	public static void main(String[] args) {
	
		Student student=new Student(501,90);
		System.out.println(student.getStudentId()+" your stipend is "+ student.calculateTotalStipend());
	}
}
