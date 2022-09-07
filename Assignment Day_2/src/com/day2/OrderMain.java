package com.day2;
import java.util.Scanner;

public class OrderMain {

	public static void main(String[] args) {

		Order order1=new Order(Order.orderId(),Order.placeOrder(),2000,"confirm");
		System.out.println(order1.toString());
		
		Order order2=new Order(Order.orderId(),Order.placeOrder(),3000,"pending");
		System.out.println(order2.toString());
		
		System.out.println("you have total "+Order.getTotalOrders()+" orders");
	}
}