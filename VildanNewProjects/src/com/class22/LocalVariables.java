package com.class22;

public class LocalVariables {
	public static void main(String[] args) {
		
		
		// i want to access variable myName from different method
		
		LocalVariables obj=new LocalVariables();
		obj.sayName();
		System.out.println("----------------");
		// wont be accessible, scope is only within main method
		//System.out.println(myName);
		String userEmail=obj.createEmail("john", "smith", "outlook");
		System.out.println(userEmail);
	
	}
	
	void sayName() {
		String myName="john";
		System.out.println(myName);
		//System.out.println(obj); wont be accessible, scope is only within main method
		//System.out.println(myName);
		
	}
	
	String createEmail(String name, String lastName, String email) {
		String userEmail=name+lastName+"@"+email+".com";
		return userEmail;
	}
	

}
