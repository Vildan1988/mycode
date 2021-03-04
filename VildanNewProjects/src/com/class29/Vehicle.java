package com.class29;

public abstract class Vehicle { //%50 define
	
	public void drive() {
		System.out.println("vehicle can drive");
	}
	
	public void stop() {
		System.out.println("Vehicle can stop");
		
	}
	//undefine
	public abstract void start();
	public abstract void speed();
	
	
}


abstract class Car extends Vehicle{ //%75
	
	public void speed() {
		
		System.out.println("Max car  speed up to 400");
	}
	public abstract void breaking();
}

class BMW extends Car{  //%100

	@Override
	public void start() {
		System.out.println("BMW starts remote");
		
	}
	@Override
	public void breaking () {
		System.out.println("BMW can break");
		
	}
	
	
	
}
