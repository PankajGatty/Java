package com.xworkz.TypeCasting;

public class VehicleRunner {
	public static void main(String[] args) {
		Car car = new Car();       
        Vehicle vehicle = car;//upcasting
        
        car.start();
        
       Car car1 =(Car)vehicle; //downcasting
       car1.drive();
	}

}
