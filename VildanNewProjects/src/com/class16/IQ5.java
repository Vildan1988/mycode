package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		
		/* Write a java program to reverse string?
		 * Reverse a string word by word?
		 */
		
		String given ="Welcome to the java class";
		
		/* to reverse String 
		 * split();
		 * Step1: split -->array of String 
		 * Step2: use for loop and use decrement to print values 
		 */
		
		String reversed = "";
		String []str = given.split("\\s");
		for (int j =str.length -1; j>=0; j--) {
			reversed = reversed + str[j] + " ";
		}
		System.out.println(reversed);

		// write a java program to reverse String?
		//toCharArray(); charAt();
		
		String given1="today is java class";
		String replaced1= "";
		char[] charArray=given1.toCharArray();
		for (int i=charArray.length-1; i>=0; i--) {
			replaced1=replaced1 + charArray[i];
			
		}
		
		System.out.println(replaced1);
		
		System.out.println("---using charAt---");
		String Word3 = "I love Java";
		String reversed2= "";
		for (int i=Word3.length() -1; i>=0; i--) {
			reversed2= reversed2 + Word3.charAt(i);
		}
		System.out.println(reversed2);
		
		
		
		
		
		
		
	}

}
