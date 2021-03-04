package com.class29;

public class VehicleTest {
	public static void main(String[] args) {
		
		Car car=new BMW();
		car.drive();
		car.breaking();
		car.speed();
		car.start();
		car.stop();
		
		Vehicle vehicle=new BMW(); 
		vehicle.drive();
		vehicle.start();
		vehicle.speed();
		vehicle.stop();
	}

}
