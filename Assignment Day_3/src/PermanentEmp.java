
public class PermanentEmp extends Employee {
	private int basicPay;
	private double hra;
	private float experience;

	public PermanentEmp(int employeeId, String employeeName, double salary) {
		super(employeeId, employeeName, salary);
	}
	public PermanentEmp(int basicPay, double hra, float experience) {
		super();
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public PermanentEmp(int employeeId, String employeeName, int basicPay, double hra, float experience) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}
	public int getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "PermanentEmployee [basicPay=" + basicPay + ", hra=" + hra + ", experience=" + experience + "]";
	}

	public int basicPay() {
		if(getExperience()>=3 && getExperience()<5) {
			return 5;
		}
		if(getExperience()>=5 && getExperience()<10) {
			return 7;
		}
		if(getExperience()>=10) {
			return 12;
		}
		return 0;
	}
	public void calculateSalary() {
		int basicPay=basicPay();
		double finalSalary=getBasicPay()+getHra()+((getBasicPay()*basicPay)/100);
		setSalary(finalSalary);
	}
	public void display() {
		System.out.println("Employee name:"+getEmployeeName());
		System.out.println("Employee id :"+getEmployeeId());
		System.out.println("salary :"+getSalary());
	}
}