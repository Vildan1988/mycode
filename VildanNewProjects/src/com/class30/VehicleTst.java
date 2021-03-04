package com.class30;

public class VehicleTst {
	
	public static void main(String[] args) {
		
		BMW bmw=new BMW("787gdh678", "Sedan", "BMW","X5");
		
		BMW.displayTotal(); //output 
		
		//Vehicle.displayTotal();
		
		//come from Vehicle class
		bmw.drive();
		bmw.speed();
		bmw.start();
		bmw.stop();
		
		//come from Car class
		bmw.breaking();
		
		//comes from BMW
		bmw.display();
		
		Car car=new BMW("7355793hsdg87", "sedan", "BMW", "X4");
		//comes from Vehicle class
		car.drive();
		car.stop();
		car.speed();
		car.start();
		//comes from Car class
		car.breaking();
		//comes from BMW --wont be available to the parent
	    //car.display
		
		Vehicle vehicle=new BMW("63893ggjd73", "SUV", "BMW", "X5");	
	    //comes from vehicle class
		vehicle.drive();
		vehicle.start();
		vehicle.stop();
		vehicle.speed();
		//comes from Car class --wont be available to the parent
		//vehicle.breaking
		//comes from BMW-----wont be available to the grandparent
		//vehicle.display
		
		new BMW("787gdh678", "4gfef", "BMW","e5");
		new BMW("1234rgfr4", "et4yh5r", "BMW","d5");
		System.out.println("_________________________________________________________");
		
		Vehicle.displayTotal();
	}

	
}
