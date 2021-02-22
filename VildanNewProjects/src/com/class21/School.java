package com.class21;

public class School {
	
	public static void main(String[] args) {
		
		Student.school ="Morning school";
		Student.GPA=4.00;
		
	    Student student0=new Student();
	    student0.displayInfo();
		
		Student  student1=new Student(); // student1 object 
		
		//assigning instance variables
		student1.studentName="Eric";
		//Student.GPA=3.95;
		//Student.school="Syntax";	//boyle de diyebilirsin
		
		student1.displayInfo();
		
		Student student2=new Student();
		
		student2.studentName="Jaime";
		//student2.GPA=3.90;
		student2.school="Syntax tech ";
		
		
		student2.displayInfo();
		
		
		Student student3=new Student();
		student3.school="Texas";
		student3.studentName="vildan";		
		
		
		System.out.println("students again");
		student1.displayInfo();
		student2.displayInfo();
		student3.displayInfo();
		student0.displayInfo();
		
		
		//int hours1, hours2;
		//hours1=4;
		//student1.study(hours1);
		
	
		
	}
	

}
