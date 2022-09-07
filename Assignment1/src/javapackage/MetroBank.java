package javapackage;

public class MetroBank {
	private int accountNumber;
	private double balance;
	private double salary;
	private String loanType;
	private int loanAmount;
	private int emi;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public int getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getEmi() {
		return emi;
	}
	public void setEmi(int emi) {
		this.emi = emi;
	}
	@Override
	public String toString() {
		return "MetroBank [accountNumber=" + accountNumber + ", balance=" + balance + ", salary=" + salary
				+ ", loanType=" + loanType + ", loanAmount=" + loanAmount + ", emi=" + emi + "]";
	}
	public boolean checkAccountNumber(int accountNumber) {
		
		if(accountNumber>1000 && accountNumber<2000) {
			return true;
		}else {
			return false;
		}	
	}
	
	public boolean eligiblity() {		
		if(getLoanType().equals("car")) {
			if(getLoanAmount()<=500000 && getEmi()<=36 && getSalary()>25000 && getBalance()>1000) {
				setEmi(36);
				setLoanAmount(500000);
				return true;
			}else {
				if(getSalary()<25000) {
					System.out.println("you are not eligible for car loan.");
				}
				if(getEmi()>=36) {
					System.out.println("we can not provide this much emi's.");
				}
				if(getLoanAmount()>500000) {
					System.out.println("you are not eligible for this loan amount.");
				}
				if(getBalance()<1000) {
					System.out.println("insufficient account balance.");
				}
				return false;
			}
		}
		else if(getLoanType().equals("house")) {
			if(getLoanAmount()<=600000 && getEmi()<=60 && getSalary()>50000 && getBalance()>1000) {
				setEmi(60);
				setLoanAmount(600000);
				return true;
			}else {
				if(getSalary()<50000) {
					System.out.println("you are not eligible for home loan.");
				}
				if(getEmi()>60) {
					System.out.println("we can not provide this much emi's.");
				}
				if(getLoanAmount()>600000) {
					System.out.println("you are not eligible for this loan amount.");
				}
				if(getSalary()<1000) {
					System.out.println("insufficient account balance.");
				}
				return false;
			}
		}
		else if(getLoanType().equals("business")) {
			if(getLoanAmount()<=7500000 && getEmi()<=84 && getSalary()>75000 && getBalance()>1000) {
				setEmi(84);
				setLoanAmount(7500000);
				return true;
			}else {
				if(getSalary()<75000) {
					System.out.println("you are not eligible for business loan.");
				}
				if(getEmi()>=84) {
					System.out.println("we can not provide this much emi's.");
				}
				if(getLoanAmount()>7500000) {
					System.out.println("you are not eligible for this loan amount.");
				}
				if(getBalance()<1000) {
					System.out.println("insufficient account balance.");
				}
				return false;
			}
		}else {
			System.out.println("Sorry Loan service not available");
			return false;
		}
		
	}
	public void display() {
		System.out.println("account no."+getAccountNumber()+",eligible amount: "+getLoanAmount()+",No. of emis"+ getEmi());
	}
}
