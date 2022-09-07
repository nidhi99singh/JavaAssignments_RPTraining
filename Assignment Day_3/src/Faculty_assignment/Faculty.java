package Faculty_assignment;

public class Faculty {

	private String name;
	private float basicSalary;
	private float bonusPercentage;
	private float carAlloancePercent;
	
	public Faculty(String name, float basicSalary) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}

	public float getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(float bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public float getCarAlloancePercent() {
		return carAlloancePercent;
	}

	public void setCarAlloancePercent(float carAlloancePercent) {
		this.carAlloancePercent = carAlloancePercent;
	}
	public double calculateSalary() {
		double salary=getBasicSalary()+(getBasicSalary()*getBonusPercentage())/100+(getBasicSalary()*getCarAlloancePercent())/100;
		return salary;
	}
	public void display(double salary) {
		System.out.println("Name :"+getName());
		System.out.println("basic salary:"+ getBasicSalary());
		System.out.println("final salary :"+salary);
	}
	
}
