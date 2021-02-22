package com.class23;

public class BetterCar {
	/* we want to build Toyota cars that will have different models
	 * and colors
	 */
	
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	BetterCar(String carModel, String carColor,int carSpeed, int carDoors ){
		
		model=carModel;
		color=carColor;
		speed=carSpeed;
		doors=carDoors;
		
	}
	
public static void main(String[] args) {
		
		make="BMW";
		// compiler will give an error, we have to pass values when we build an object
		//those values will be passed as arguments  to the constructor 
		//through constructor instance variables will get initialized.
		//BetterCar bcar1=new BetterCar();
		
		BetterCar bcar1=new BetterCar("X5", "blue", 400, 2);
		bcar1.getDetails();
	}
	
	public void getDetails() { //method body
		
		System.out.println("I build "+make+" "+model+" "+color);
		System.out.println("my car has " +doors+" doors and  have speed up to "+speed);
	
	}
	
	
					

}
