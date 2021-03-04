package com.class27;

public class Car {
	
	String make,model;
	int year;
	
	Car(){
		System.out.println("I am non argument constructor");
	}
	
	public void display() {
		System.out.println("we build "+year+" "+make+" "+model);
	}
	
     public static void main(String[] args) {
		
    	 Car car=new Car();
    	 
    	 car.display();
    	 
    	// int num;-->CE local variable must be initialized
    	// System.out.println(num);
    	 
    	System.out.println("_________object of child class__________"); 
    	
    	
    	 Tesla tesla=new Tesla();
    	 
	}
}

class Tesla extends Car{
	
	boolean autoPilot;
	
	Tesla(){
		super();
		System.out.println("non argument constructor of the child class");
	}
}





