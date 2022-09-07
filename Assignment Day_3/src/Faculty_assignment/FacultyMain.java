package Faculty_assignment;

public class FacultyMain {

	public static void main(String[] args) {
		
		System.out.println("Faculty Details");
		Faculty faculty1=new Faculty("Nidhi",25000);
		faculty1.setBonusPercentage(4);
		faculty1.setCarAlloancePercent(2.5f);
		double salary=faculty1.calculateSalary();
			faculty1.display(salary);

		System.out.println("\nFaculty Details");	
		OfficeStaff staff=new OfficeStaff("Mansi",10000,"Accountant");
		staff.dispaly();
		
		System.out.println("\nFaculty Details");
		Teacher teacher=new Teacher("Sonali", 10000,"Bachelors");
		teacher.dispaly();
		
	}

}
