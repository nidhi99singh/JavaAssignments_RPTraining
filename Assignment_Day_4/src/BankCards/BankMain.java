package BankCards;
import java.util.Scanner;

public class BankMain {

	public static void main(String [] args) {
		//Payment Class
//		Payment payment1=new CreditCardPayment(1001);
//		System.out.println(payment1.getCustomerId());
	
//		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter credit card bill amount ");
		double amount=sc.nextDouble();
		
//		CreditCardPayment creditCard=new CreditCardPayment(1001);
//		creditCard.payBill(amount);
//		creditCard.display();
//		System.out.println("Bill Amount: "+creditCard.finalBillAmount(amount));
		
		Payment p=new CreditCardPayment(2002);
		CreditCardPayment cd=(CreditCardPayment)p;
		cd.payBill(amount);
		cd.display();
		System.out.println("Bill Amount: "+cd.finalBillAmount(amount));
		
		//credit card 1
		System.out.println("enter credit card bill amount ");
		double amount1=sc.nextDouble();
		Payment p1=new CreditCardPayment(2002);
		CreditCardPayment cd1=(CreditCardPayment)p1;
		cd1.payBill(amount1);
		cd1.display();
		System.out.println("Bill Amount: "+cd1.finalBillAmount(amount1));
		
		//debit card bill
		System.out.println("enter debit card bill amount ");
		double debitAmount=sc.nextDouble();
		DebitCardPayment debitCard=new DebitCardPayment(1001);
		debitCard.payBill(debitAmount);
		debitCard.discount(debitAmount);
		debitCard.display();
		System.out.println("Bill Amount: "+ debitCard.finalBillAmount(debitAmount));
			
	}
}

