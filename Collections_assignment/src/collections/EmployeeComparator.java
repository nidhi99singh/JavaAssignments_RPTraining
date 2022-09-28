package collections;

public class EmployeeComparator{

	private int employeeId;
	private String employeeName;
	private String designation;
	private int age;
	
	public EmployeeComparator() {
		super();
	}
	
	public EmployeeComparator(int employeeId, String employeeName, String designation, int age) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.age = age;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		System.out.println("Employee Details: \t Employee Id: "+getEmployeeId()+", Name: "+getEmployeeName()+", Employee age: "+getAge()+", designation :"+getDesignation());
	}
	
}
