package com.class27;

public class Examples {

	public String helloName(String str) {    //overloading
		
		return str;
		
	}
	
	public String helloName(String str, String str1) {
		
		return str+" "+str1;
		
	}}
	
	class smallExample extends Examples{  //overriding
		
		public String helloName(String str) {
			
			return "hello"+str;
		
		
		
	}
	
	
}
