package Faculty_assignment;

public class Teacher extends Faculty {

	private String qualification;

	public Teacher(String name, float basicSalary, String qualification) {
		super(name, basicSalary);
		this.qualification = qualification;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	public float additionalSalary() {
		if(qualification.equals("Doctoral")) {
			return 20000;
		}
		if(qualification.equals("Masters")) {
			return 18000;
		}
		if(qualification.equals("Bachelors")) {
			return 15500;
		}
		if(qualification.equals("Associate")) {
			return 10000;
		}
		return 0;
	}
	 public double calculateSalary() {
		 float additionalSalary=additionalSalary();
		 double finalSalary=additionalSalary+getBasicSalary();
		 return finalSalary;
	 }
	 public void dispaly() {
		 	System.out.println("Name :"+getName());
		 	System.out.println("Qualification: "+getQualification());
			System.out.println("basic salary: "+ getBasicSalary());
			System.out.println("final salary: "+calculateSalary());
	 }
}
