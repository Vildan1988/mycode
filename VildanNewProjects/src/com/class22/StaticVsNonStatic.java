package com.class22;

public class StaticVsNonStatic {
	
	//template for a student (school,name,grade)
	
	static String school="Syntax";
	String name;
	char grade;
	
	//instance method or non static method
	void getInfo() {
		System.out.println("My name is "+name+" and i am going to "+school+ "and my grades is " +grade);
	}
	
	
	//static method
	static void getInfo1() {
		System.out.println("I am attending classes at "+school);
	
		
	}
	public static void main(String[] args) {
		/*accessing static members within same class just use name for a variable 
		 * or call method by its name only
		 */
		
		System.out.println(school);
		getInfo1();
	}
	
	
	

}
