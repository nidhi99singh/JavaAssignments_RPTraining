
public class ContractEmployee extends Employee {

	private double wages;
	private float hoursWorked;
	
	public ContractEmployee(int employeeId, String employeeName, double wages, float hoursWorked) {
		super(employeeId, employeeName);
		this.wages = wages;
		this.hoursWorked = hoursWorked;
	}
	public ContractEmployee(int employeeId, String employeeName, double salary, double wages, float hoursWorked) {
		super(employeeId, employeeName, salary);
		this.wages = wages;
		this.hoursWorked = hoursWorked;
	}
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	public float getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public void calculateSalary() {
		double salary=getHoursWorked()*getWages();
		setSalary(salary);
	}
	public void display() {
		System.out.println("Employee name :"+getEmployeeName());
		System.out.println("Employee Id: "+getEmployeeId());
		System.out.println("Employee wages"+getWages());
		System.out.println("EMployee hours worked :"+getHoursWorked());
		System.out.println("Salary : "+getSalary());
	}
	
	
}
