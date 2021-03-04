package com.class31;

public class Parent {
	
	static void hello() {
		System.out.println("hello from super class");
	}

}
class Child extends Parent{
	 static void hello() {
		System.out.println("hello from sub class");//hidden method 
	}
}


