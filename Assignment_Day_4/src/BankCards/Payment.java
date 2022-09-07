package BankCards;

abstract class Payment {

	private int customerId;
	private String paymentId;
	private double taxPercentage;
	
	
	public Payment() {
		super();
	}
	public Payment(int customerId) {
		this.customerId = customerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}
	
	public abstract void payBill(double amount);
}
