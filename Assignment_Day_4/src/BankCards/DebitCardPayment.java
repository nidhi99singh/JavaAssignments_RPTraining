package BankCards;

public class DebitCardPayment extends Payment {

	private static int counter;
	private double discountPercent;
	
	static {
		counter=1000;
	}
	
	public DebitCardPayment(int customerId) {
		super(customerId);
		counter++;
		setPaymentId("D"+getCounter());
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		DebitCardPayment.counter = counter;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	@Override
	public void payBill(double amount) {
		if(amount<=500) {
			setTaxPercentage(2.5);
		}
		if(amount>500 && amount<=1000) {
			setTaxPercentage(4);
		}
		if(amount>1000) {
			setTaxPercentage(5);
		}
	}
	public void discount(double amount) {
		if(amount<=500) {
			setDiscountPercent(1);
		}
		if(amount>500 && amount<=1000) {
			setDiscountPercent(2);
		}
		if(amount>1000) {
			setDiscountPercent(3);
		}
	}
	public double finalBillAmount(double amount) {
		double finalAmount=amount+((amount*getTaxPercentage())/100)-((amount*getDiscountPercent())/100);
		return finalAmount;
	}
	public void display() {
		System.out.println("Customer ID: "+getCustomerId());
		System.out.println("Payment ID: "+getPaymentId());
		System.out.println("Tax Percentage: "+getTaxPercentage()+"%");
		System.out.println("Discount Percentage: "+getDiscountPercent()+"%");
	}
}
