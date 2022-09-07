package com.day2;

public class Participants {

	private static int counter;
	private String registeredId;
	private String name;
	private long contactNumber;
	private String city;
	
	static {
		counter=10001;
	}

	public Participants(String registeredId, String name, long contactNumber, String city) {
		super();
		this.registeredId = registeredId;
		this.name = name;
		this.contactNumber = contactNumber;
		this.city = city;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Participants.counter = counter;
	}

	public String getRegisteredId() {
		return registeredId;
	}

	public void setRegisteredId(String registeredId) {
		this.registeredId = registeredId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public static String generateId() {
		String id="D"+getCounter();
		counter++;
		return id;
	}
	public void display() {
		System.out.println("Hi"+getName()+"!your regiatration id is "+getRegisteredId());
	}

	@Override
	public String toString() {
		return "Participants [registeredId=" + registeredId + ", name=" + name + ", contactNumber=" + contactNumber
				+ ", city=" + city + "]";
	}
	
}
