package javapackage;

public class RestaurantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestaurantClass restaurant=new RestaurantClass();
		restaurant.setRestaurantName("Kanha");
		restaurant.setRestaurantContanct(1234567890);
		restaurant.setAddress("Jaipur");
		restaurant.setRating(4.5f);
		restaurant.displayDetails();
		
		RestaurantClass restaurant1=new RestaurantClass("Mc'D",1212121212,"Mumbai",5.0f);
		System.out.println("parameterized constructor....");
		restaurant1.displayDetails();
	}

}
