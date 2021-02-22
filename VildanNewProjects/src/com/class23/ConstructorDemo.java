package com.class23;

public class ConstructorDemo {
	
	//ConstructorDemo(){
     // }
	
	ConstructorDemo(){
	System.out.println("I am your constructor");  //2
   }
	ConstructorDemo(String str){
		System.out.println("I am your constructor with 1 parameter "+str);
	   }
	ConstructorDemo(int num){
		System.out.println("I am your constructor with 1 parameter "+num);
	}
	ConstructorDemo(int num,String str ){
		System.out.println("I am your constructor with 2 parameter "+num);  //6
	
	}
	
	
	
	public static void main(String[] args) {
		
		ConstructorDemo obj=new ConstructorDemo();  //1
		
		System.out.println("code after creating an OBJECT");  //3
		obj.hello();  //4!asagi
		
		ConstructorDemo obj2=new ConstructorDemo(123,"String");  //5
		
		
	}
	public void hello() {
		
		System.out.println("hello class");
		System.out.println("hello instructors");
	}
	
	public void hello(String str) {
		
		System.out.println("hello class1");
		System.out.println("hello instructors1");
	}
	
	
	

}
