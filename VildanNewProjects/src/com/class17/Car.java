package com.class17;

public class Car {
	//define attribute/features
	
	String make,model,color;
	int year,wheels,windows,speed;
	
	
	// adding behavior / actions-->methods();
	
	void drive() {
		System.out.println("Car "+make+" can drive");
	}
	
	void start() {
		 System.out.println("Car "+make+" can start");
	}
	
    void accelerate() {
    	 System.out.println("Car "+make+" can accelerate");
     }
    void reverse() {
    	System.out.println("Car "+make+" can reverse");
    }
}
