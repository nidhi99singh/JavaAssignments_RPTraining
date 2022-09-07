
public class EmployeeMain {

	public static void main(String[] args) {
		PermanentEmp employee1=new PermanentEmp(2001, "Garima", 20000,200, 4);
		employee1.calculateSalary();
		employee1.display();
		
		ContractEmployee employee2=new ContractEmployee(2001, "Rohan", 300, 10);
		employee2.calculateSalary();
		employee2.display();
	}

}
