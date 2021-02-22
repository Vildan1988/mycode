package com.class23;

public class Car {

	/* we want to build Toyota cars that will have different models
	 * and colors
	 */
	
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
																											//this is template
	public void getDetails() { //method body
		System.out.println("I build "+make+" "+model+" "+color);
		System.out.println("my car has " +doors+" doors and  have speed up to "+speed);
	}
	
	
}
