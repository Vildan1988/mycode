package com.class30;

public interface Drivable {
	
	//public static final variables
	
	//public static final -->you don't have to write it. compiler will add it
	
	boolean DRIVE_FAST=true;//constant variables are written using upper case
	
	//by default compiler will add public abstract to the methods
	//public abstract 
	void drive();

}
class Cars{
	
	public void stop() {
		System.out.println("car stops by pressing breaks");
	}
}

class Toyota extends Cars implements Drivable{

	@Override
	public void drive() {
		
		System.out.println("toyota can drive");
		
	}
	
}
