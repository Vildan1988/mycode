package com.class24;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
		
		System.out.println("I am non argument constructor");
	}
	
	ThisWithConstructor(String str){
		this();//used to call current constructor
		System.out.println("I am constructor with 1 String parameter");
	}
	ThisWithConstructor(String str, String str1){
		this(str);//always MUST be a first statement
		//this(); in this case it is second statement -->compiler error
		
		System.out.println("I am a constructor with 2 parameters");
		
	}
	
	
	
	
	
	  public static void main(String[] args) {
		
		  ThisWithConstructor obj=new ThisWithConstructor("hello");
		  System.out.println("___________________________________________________________________");
		  //ThisWithConstructor obj1=new ThisWithConstructor("hello");
		  
		  //can we execute 2 constructor when creating an object
		  //YES -it can be achieve using "this()"keyword
		  //this type of constructor calls is known as CONSTRUCTOR CHAINING
		  
		  
		  ThisWithConstructor obj1=new ThisWithConstructor("hello","Bye");
		  
		  
	}
	

}
