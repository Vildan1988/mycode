package com.class21;

public class Student {
	
	
	public  String studentName;        //instance variable 
	public static double GPA;			     //instance variable
	public static String school;       //instance variable
	
	public void displayInfo() {
		System.out.println(studentName + " attending " + school + " has a GPA of " + GPA);
	}
	
	
	
	    public void  study(int hours) {
	    
		int localVariable=4;
		System.out.println(studentName + " is studying for " + hours + " hours.");
	}
	
	
	

}
