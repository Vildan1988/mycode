package com.class20;

public class Task1 {
	public static void main(String[] args) {
		
		
		Task1 task =new Task1();
		String result1= task.reverseString("Syntax");
		
		System.out.println(result1);
		
		String str="Anna";
		boolean result2=task.isPalindrome(str);
		System.out.println("Is "+ str +" Palindrome? " +result2);
		
		String[] strArray=task.arrayOfWords("What a beautiful day is today!");
		System.out.println("The length of the array is: " +strArray.length);
		for (String word:strArray) {
			System.out.println(word);
		}
	}
	
	public boolean isPalindrome(String par) {
		boolean result2=false;
		
		String reverse=reverseString(par);
			
		if (par.equalsIgnoreCase(reverse)) {
			result2=true;
		}else {
			result2=false;
		}
		
		return result2;
		
	}
	
	
	
	String reverseString (String param) {
		
		String result="";
		
		char[] charArray=param.toCharArray();
		
		for (int i=charArray.length-1; i>=0; i--) {
			
			result +=charArray[i];
		}
		return result;
		
	}
	
	private String[] arrayOfWords(String sentence){
		
		//String[] stringArray;                   long way
		//stringArray=sentence.split(" ");
		//return stringArray;
		
		return sentence.split(" ");
		
		
		
		
	}
	
	

}
