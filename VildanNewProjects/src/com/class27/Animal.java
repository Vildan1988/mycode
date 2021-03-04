package com.class27;

public class Animal {
	
	
	Animal(){
		System.out.println("animal constructor");
	}
	
	public static void whoAmI() {
		System.out.println("I am an Animal");
	}
	public static void main(String[] args) {
		Animal animal=new Animal();
		}

}

class Monkey extends Animal{
	
	Monkey(){
		System.out.println("I am a child class constructor");
	}
	
	//cannot override static method with instance methods
	//public void whoAmI() {
		
	//}
	//we cannot override static method when both method are static 
	//within sub and super class it is method hiding
	
	public static void whoAmI() {
		System.out.println("I am a monkey");
	}
	
	
	
}
