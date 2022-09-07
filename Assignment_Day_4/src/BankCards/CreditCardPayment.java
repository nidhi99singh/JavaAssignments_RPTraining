package BankCards;

public class CreditCardPayment extends Payment {

	private static int counter;
	static {
		counter=1000;
	}

	public CreditCardPayment(int customerId) {
		super(customerId);
		setPaymentId("C"+getCounter());
		setCounter(getCounter()+1);
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CreditCardPayment.counter = counter;
	}

	@Override
	public void payBill(double amount) {
		if(amount<=500) {
			setTaxPercentage(3);
		}
		if(amount>500 && amount<=1000) {
			setTaxPercentage(5);
		}
		if(amount>1000) {
			setTaxPercentage(6);
		}
	}
	
	public double finalBillAmount(double amount) {
		double finalAmount=amount+((amount*getTaxPercentage())/100);
		return finalAmount;
	}
	public void display() {
		System.out.println("Customer ID: "+getCustomerId());
		System.out.println("Payment ID: "+getPaymentId());
		System.out.println("Tax Percentage: "+getTaxPercentage());
	}
	
}
