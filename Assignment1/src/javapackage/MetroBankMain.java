package javapackage;

public class MetroBankMain {

	public static void main(String[] args) {
	
		//car loan
		
		MetroBank loan1=new MetroBank();
		loan1.setAccountNumber(1324);
		loan1.setBalance(35000);
		loan1.setEmi(20);
		loan1.setLoanAmount(100000);
		loan1.setLoanType("car");
		loan1.setSalary(34000);
		
		if(!loan1.checkAccountNumber(loan1.getAccountNumber())) {
			System.out.println("Account number : "+loan1.getAccountNumber()+" enter valid account number. Note:account number must be of 4 digit and must start with 1 ");
		}else {
			if(loan1.eligiblity()) {
				System.out.println("Car Loan Pass.");	
			}
			loan1.display();	
		}
		
	//	house loan
		MetroBank loan2=new MetroBank();
		loan2.setAccountNumber(1256);
		loan2.setBalance(30000);
		loan2.setEmi(56);
		loan2.setLoanAmount(500000);
		loan2.setLoanType("house");
		loan2.setSalary(70000);
		

		if(!loan2.checkAccountNumber(loan2.getAccountNumber())) {
			System.out.println("Account number : "+loan2.getAccountNumber()+"enter valid account number. Note:account number must be of 4 digit and must start with 1 ");
		}else {
			if(loan2.eligiblity()) {
				System.out.println("Home Loan Pass.");	
			}
			loan2.display();		
		}
		
		//business loan
		MetroBank loan3=new MetroBank();
		loan3.setAccountNumber(1777);
		loan3.setBalance(100000);
		loan3.setEmi(80);
		loan3.setLoanAmount(1500000);
		loan3.setLoanType("business");
		loan3.setSalary(80000);
		if(!loan3.checkAccountNumber(loan3.getAccountNumber())) {
			System.out.println("Account number : "+loan3.getAccountNumber()+" enter valid account number. Note:account number must be of 4 digit and must start with 1 ");
		}else {
		if(loan3.eligiblity()) {
			System.out.println("business Loan Pass.");	
		}
		loan3.display();}
	}

}
