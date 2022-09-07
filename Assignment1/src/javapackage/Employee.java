package javapackage;

public class Employee {

	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;
	
	public String getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}


	public int getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}

	public void calculateSalary() {
		if(getJobLevel()>=4) {
			setBonus(100);
		}else{
			setBonus(50);
		}
		setSalary(getSalary()+getBonus());
	}
	public void displayDetails() {
		System.out.println("Employee Details are: \nEmployeeId :"+getEmployeeId()+"\nEmployee Name: "+getEmployeeName()+"\nemployee job level:"+getJobLevel()+"\nEmployeeSalary:"+getSalary()+"\nbonus:"+getBonus());
	}
}
