package com.day2;

public class CinemaMain {

	public static void main(String[] args) {
		Cinema cinema=new Cinema("abc@gmail.com",50);
		cinema.checkAvailability();
		if(cinema.isBooked()) {
			cinema.display();
		}else {
			System.out.println("Houseful, please try next time.");
		}
		System.out.println("available"+Cinema.getSeatsAvaiable());
	
	//second booking
		Cinema cinema1=new Cinema("xyz@gmail.com",500);
		cinema1.checkAvailability();
		if(cinema1.isBooked()) {
			cinema1.display();
		}else {
			System.out.println("Houseful, please try next time.");
			System.out.println("available seats "+Cinema.getSeatsAvaiable());
		}
		
	}

}
