package javapackage;

public class EmployeeMain {

	public static void main(String[] args) {
	
		Employee employee=new Employee();
		employee.setEmployeeId("Emp101");
		employee.setEmployeeName("Nidhi");
		employee.setJobLevel(2);
		employee.setSalary(10000);
		employee.calculateSalary();
		employee.displayDetails();
		
		//second employee
		Employee employee2=new Employee();
		employee2.setEmployeeId("Emp102");
		employee2.setEmployeeName("Neha");
		employee2.setJobLevel(6);
		employee2.setSalary(60000);
		employee2.calculateSalary();
		employee2.displayDetails();
			
	}
}
