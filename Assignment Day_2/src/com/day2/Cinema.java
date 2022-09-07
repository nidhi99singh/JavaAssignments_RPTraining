package com.day2;

public class Cinema {
	private String customerEmail;
	private int seatsRequired;
	private boolean isBooked;
	private static int seatsAvaiable;
static {
	seatsAvaiable=400;
}

public Cinema(String customerEmail, int seatsRequired) {
	super();
	this.customerEmail = customerEmail;
	this.seatsRequired = seatsRequired;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public int getSeatsRequired() {
	return seatsRequired;
}
public void setSeatsRequired(int seatsRequired) {
	this.seatsRequired = seatsRequired;
}
public boolean isBooked() {
	return isBooked;
}
public void setBooked(boolean isBooked) {
	this.isBooked = isBooked;
}
public static int getSeatsAvaiable() {
	return seatsAvaiable;
}
public static void setSeatsAvaiable(int seatsAvaiable) {
	Cinema.seatsAvaiable = seatsAvaiable;
}
public void checkAvailability() {
	if(getSeatsRequired()<=getSeatsAvaiable()) {
		setBooked(true);
		setSeatsAvaiable(seatsAvaiable-getSeatsRequired());
	}else {
		setBooked(false);
	}
}

public void display() {
	System.out.println("Tickets booked successfully.\nEmailID: "+getCustomerEmail()+",seats booked :"+getSeatsRequired());
}
}
