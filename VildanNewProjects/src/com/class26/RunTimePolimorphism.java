package com.class26;

public class RunTimePolimorphism {

	public static void main(String[] args) {
		
		
		//creating an object on parent class 
		
		Animal animal=new Animal();
		animal.eat();
		animal.sleep();
		
		//creating an object on child class
		
		Cat cat=new Cat();
		cat.eat();//from parent
		cat.sleep();//from child
		cat.meow();//from child
		
		
		
		
		//widening 
		double d=90;
		//narrowing
		int i=(int)1.99;
		
		System.out.println("_____________________________________________");
		
		//non primitive typecasting
		
		//widening-->creating an object of the class and giving reference to the parent class
		Animal obj=new Cat();
		
		//narrowing 
		//Cat obj2=new Animal();-->  compiler gives error (genelden ozele gibi dusun)cannot covert from animal to cat
		
		obj.eat();//coming from parent
		obj.sleep();// this method will come from child class-->runtime polymorphism
		
		//obj.meow();compiler error->method won't available
		
	}
}
