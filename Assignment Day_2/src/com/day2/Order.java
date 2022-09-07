package com.day2;
import java.util.Arrays;
import java.util.Scanner;
public class Order {

	private static int orderIdCounter;
	private int orderId;
	private String food[]=new String[6];
	private double totalPrice;
	private String status;
	static {
		orderIdCounter=100;
	}

	public Order(int orderId, String[] food, double totalPrice, String status) {
		super();
		this.orderId = orderId;
		this.food = food;
		this.totalPrice = totalPrice;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", food=" + Arrays.toString(food) + ", totalPrice=" + totalPrice
				+ ", status=" + status + "]";
	}

	public static int getOrderIdCounter() {
		return orderIdCounter;
	}
	public static void setOrderIdCounter(int orderIdCounter) {
		Order.orderIdCounter = orderIdCounter;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String[] getFood() {
		return food;
	}
	public void setFood(String[] food) {
		this.food = food;
	}
	public double getTotalPrice() {
		return totalPrice;
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
	public static int orderId() {
		orderIdCounter++;
		return orderIdCounter;
}
	public static int getTotalOrders() {
		int total=getOrderIdCounter()-100;
		return total;
	}
	
	public static String[] placeOrder() {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many orders you want to place(maximum orders 5) :");
		int count=sc.nextInt();
		String choice[]=new String[count];
		System.out.println("enter food ");
		for(int i=0;i<count;i++) {
		choice[i]=sc.next();
}
		return choice;
	}
	
}
