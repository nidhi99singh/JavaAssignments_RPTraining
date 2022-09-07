package javapackage;

public class RestaurantClass {

	private String restaurantName;
	private long restaurantContanct;
	private String address;
	private float rating;
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public long getRestaurantContanct() {
		return restaurantContanct;
	}
	public void setRestaurantContanct(long restaurantContanct) {
		this.restaurantContanct = restaurantContanct;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	public RestaurantClass(String restaurantName, long restaurantContanct, String address, float rating) {
		super();
		this.restaurantName = restaurantName;
		this.restaurantContanct = restaurantContanct;
		this.address = address;
		this.rating = rating;
	}
	
	public RestaurantClass() {
		
	}
	public void displayDetails() {
	System.out.println("Restaurant Details :\nRestaurant Name :"+ getRestaurantName()+"\nRestaurant Contact : "+getRestaurantContanct()+"\nRestaurant address : "+getAddress()+"\nRating: "+getRating());
	}
	}
