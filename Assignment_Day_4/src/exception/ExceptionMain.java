package exception;

public class ExceptionMain {

	public static void main(String[] args) {

	Applicant applicant1=new Applicant();
	applicant1.setName("Nidhi");
	applicant1.setAge(23);
	applicant1.setJobProfile("Clerk");
	
	Applicant applicant2=new Applicant();
	applicant2.setName("Nidhi");
	applicant2.setAge(43);
	applicant2.setJobProfile("clerk");
	
	Validator valid=new Validator();
	valid.validate(applicant1);
	valid.validate(applicant2);
	
	}

}
