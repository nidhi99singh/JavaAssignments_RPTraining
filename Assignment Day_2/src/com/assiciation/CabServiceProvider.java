package com.assiciation;

public class CabServiceProvider {

	private String cabServiceName;
	private int totalCabs;
	private Driver driver;
	
	public CabServiceProvider(String cabServiceName, int totalCabs, Driver driver) {
		super();
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
		this.driver = driver;
	}
	public String getCabServiceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	public int getTotalCabs() {
		return totalCabs;
	}
	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	@Override
	public String toString() {
		return "CabServiceProvider [cabServiceName=" + cabServiceName + ", totalCabs=" + totalCabs + "]";
	}
	public float calculateBonus() {
		if(driver.getRating()>=4 && driver.getRating()<4.5 && getCabServiceName()=="Halo") {
			float bonus= driver.getRating()*5;
			return bonus;
		}
		if(driver.getRating()>=4.5 && driver.getRating()<=5 && getCabServiceName()=="Halo") {
			float bonus= driver.getRating()*10;
			return bonus;
		}
		if(driver.getRating()>=4 && driver.getRating()<4.5 && getCabServiceName()=="Aber") {
			float bonus= driver.getRating()*3;
			return bonus;
		}
		if(driver.getRating()>=4.5 && driver.getRating()<=5 && getCabServiceName()=="Aber") {
			float bonus= driver.getRating()*10;
			return bonus;
		}
		System.out.println("Sorry, bonus not available");
		return 0;
	}
	
	
}
