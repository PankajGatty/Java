package com.xworkz.abstraction;

public class Fan extends Electronics{
	
	@Override
	public  void consumePower() {
		System.out.println("Consume power");
	}
	
	@Override
	public void powerOn() {
		System.out.println("Power On");
		
	}
	
	

}
