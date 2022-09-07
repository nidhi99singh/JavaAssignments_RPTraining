package exception;

public class Validator extends Applicant{

	public boolean validateName(String name){
		
		if(name==null || name.isEmpty())
		{
			return false;
		}else {
			return true;	
		}		
	}

	public boolean validateAge(int age) {
		if(age>=18 && age<=30) {
			return true;
		}
		else {
		return false;	
		}
	}
	
	public boolean validateJobProfile(String jobProfile){
		if(jobProfile.equals("Clerk") || jobProfile.equals("Associate")|| 
				jobProfile.equals("Executive")|| jobProfile.equals("Officer")) {
			return true;
		}
		else {
			return false;
		}
	}
	public void validate(Applicant applicant) {
		int flag=0;
		try {
			
			if(!validateName(applicant.getName())) {
				flag=1;
				throw new InvalidNameException("name can not be null or empty.");
				}
			if(!validateAge(applicant.getAge())){
				flag=1;
				throw new InvalidAgeException("age can not be less than 18 or more than 30.");
			}
			if(!validateJobProfile(applicant.getJobProfile())) {
				flag=1;
				throw new InvalidJobProfileException("invalid job type");
			}
		}catch(InvalidNameException e) {
			  System.out.println("caught exception "+e);
			}
		catch(InvalidAgeException e) {
				System.out.println("caught exception "+e);
			}catch (InvalidJobProfileException e) {
				System.out.println("caught exception "+e);
			}
		if(flag==0)
		System.out.println("Application send successfully!");
	}
}
