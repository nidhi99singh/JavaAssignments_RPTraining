package javapackage;

public class Ordermain {

	public static void main(String[] args) {
		
		Order order1=new Order();
		order1.setOrderId(101);
		order1.setOrderedFood("Pasta");
		order1.setStatus("confirm");
		double price=order1.calculateTotalPrice(200);
		order1.setTotalPrice(price);
		order1.display();
		
		//calling default constructor
		Order order2=new Order();
		order2.setStatus("Pending");
		
		System.out.println("\nStatus of order 2: "+order2.getStatus());
		
		Order order3=new Order(102,"Canceled");
		System.out.println("OrderId: "+order3.getOrderId()+"\nStatus of order 3: "+order3.getStatus());
	
		System.out.println("\nparameterized constructor...");
		Order order4=new Order(103,"Pizza",300,"Preparing");
		order4.display();
			
	}
	

}
