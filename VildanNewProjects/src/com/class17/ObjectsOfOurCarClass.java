package com.class17;

public class ObjectsOfOurCarClass {
	
	public static void main(String[] args) {
		
		//to create an object syntax is
		//ClassName variable=new ClassName()
		
		//Scanner scan=new Scanner(System.in);
		//String str=new String();
		
		
		
		Car car1=new Car();
		car1.make="Tesla";
		car1.model="S";
		car1.color="Black";
		car1.year=2020;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		
		//accessing behavior 1 object
		
		car1.start();
		car1.accelerate();
		car1.drive();
		System.out.println("---------------------------");
		
		Car car2=new Car();
		car2.make="BMW";
		car2.model="i8";
		car2.color="Purple";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=6;
		car2.speed=300;
		car2.make="Toyota";
		
		//accessing behavior 2 objects
		
		car2.accelerate();
		car2.drive();
		car2.start();
		car2.reverse();
		
		System.out.println("----------------------------");
		
		//print features of the car 
		// i have black Tesla
		
		System.out.println("I have  "+car1.color+" "+car1.make);
		
		//I drive BMW 2019
		
		System.out.println("I drive "+car2.make+" "+car2.year);
		
		
		//Bus bus1=new Bus();
		
		
		
		
		
		
		
	}

}
