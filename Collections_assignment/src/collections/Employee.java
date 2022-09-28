package collections;

import java.util.ArrayList;

public class Employee implements Comparable<Employee>{

	private int employeeId;
	private String employeeName;
	private String designation;
	private int age;
	
	public Employee() {
	}
	public Employee(int employeeId, String employeeName, String designation, int age) {
		super();
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
	
	//descending order based on age.
	@Override
//	public int compareTo(Employee e) {	
//		int age=e.getAge();
//		return age-this.age;
//	}
	
	//descending order based on Id
	public int compareTo(Employee e) {	
		int id=e.getEmployeeId();
		return id - this.employeeId;
	}
	
	public void display() {
		System.out.println("Employee Details: \t Employee Id: "+getEmployeeId()+", Name: "+getEmployeeName()+", Employee age: "+getAge()+", designation :"+getDesignation());
	}
}

