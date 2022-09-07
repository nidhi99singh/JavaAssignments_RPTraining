package com.assiciation;

public class CabServiceProviderMain {

	public static void main(String[] args) {
		
		
		Driver driver=new Driver("kim", 4f);
		CabServiceProvider service=new CabServiceProvider("Halo",20,driver);
		System.out.println(service.toString());
		System.out.println( service.getDriver().getDriverName()+",your Bonus is "+ service.calculateBonus());
		
		Driver driver1=new Driver("Mary", 4.2f);
		CabServiceProvider service1=new CabServiceProvider("Halo",10,driver1);
		System.out.println(service1.toString());
		System.out.println( service1.getDriver().getDriverName()+",your Bonus is "+ service1.calculateBonus());
		//System.out.println(service1.getDriver().getDriverName());
		
		Driver driver2=new Driver("Mary", 4.8f);
		CabServiceProvider service2=new CabServiceProvider("Aber",40,driver2);
		System.out.println(service2.toString());
		System.out.println( service2.getDriver().getDriverName()+",your Bonus is "+ service2.calculateBonus());
		
		Driver driver3=new Driver("Mary", 3.9f);
		CabServiceProvider service3=new CabServiceProvider("Aber",40,driver3);
		System.out.println(service3.toString());
		System.out.println( service3.getDriver().getDriverName()+",your Bonus is "+ service3.calculateBonus());
		
	}

}
