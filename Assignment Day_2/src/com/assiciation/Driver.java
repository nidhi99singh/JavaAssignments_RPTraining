package com.assiciation;

public class Driver {

	private String driverName;
	private float rating;
	
	public Driver(String driverName, float rating) {
		super();
		this.driverName = driverName;
		this.rating = rating;
	}
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
}
