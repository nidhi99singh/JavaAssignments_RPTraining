package Faculty_assignment;

public class OfficeStaff extends Faculty {

	private String designation;

	public OfficeStaff(String name, float basicSalary, String designation) {
		super(name, basicSalary);
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	 public float additionalSalary() {
		 if(designation.equals("Accountant")){
			 return 10000;
		 }
		 if(designation.equals("Clerk")) {
			 return 7000;
		 }
		 if(designation.equals("Peon")) {
			 return 4500;
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
		 	System.out.println("Designation: "+getDesignation());
			System.out.println("basic salary:"+ getBasicSalary());
			System.out.println("final salary :"+calculateSalary());
	 }
}
