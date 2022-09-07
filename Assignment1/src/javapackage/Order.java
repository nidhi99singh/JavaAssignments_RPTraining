package javapackage;

public class Order {
	private int orderId;
	private String orderedFood;
	private double totalPrice;
	private String status;
	
	
	public Order() {
		super();
	}
	
	public Order(int orderId, String orderedFood, double totalPrice, String status) {
		super();
		this.orderId = orderId;
		this.orderedFood = orderedFood;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public Order(int orderId, String status) {
		super();
		this.orderId = orderId;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	public String getOrderedFood() {
		return orderedFood;
	}
	public void setOrderedFood(String orderedFood) {
		this.orderedFood = orderedFood;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public double calculateTotalPrice(int unitPrice) {
		double tax=(unitPrice*5)/100;
		double totalPrice=unitPrice+tax;
			return totalPrice;
}
	public void display() {
		System.out.println("Order Details : \n"+"OrderId :"+getOrderId()+"\nOrdered Food: "+getOrderedFood()+"\ntotal price: "+getTotalPrice()+"\nstatus:"+getStatus());
	}
}
