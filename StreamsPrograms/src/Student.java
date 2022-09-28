

public class Student {
	
	private String studentName;
	private int studentId;
	private int age;
	private char grade;
	
	public Student() {
	}
	public Student(String studentName, int studentId, int age, char grade) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.age = age;
		this.grade = grade;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	

}

