package com.class23;

public class Student {
	
	public  String name;
	public int grade1,grade2,grade3;
	
Student(String studentName, int studentGrade1, int studentGrade2, int studentGrade3){
	
	name=studentName;
	grade1=studentGrade1;
	grade2=studentGrade2;
	grade3=studentGrade3;
}
	
	
	public static void main(String[] args) {
	
		Student student1=new Student("john",90,78,100);
		student1.calculateAvarege();
		
		Student student2=new Student("anna",90,88,100);
		student2.calculateAvarege();
		
		Student student3=new Student("mehmet",90,68,100);
		student3.calculateAvarege();
		
		Student student4=new Student("ibrahim",90,58,100);
		student4.calculateAvarege();
		
		Student student5=new Student("ozlem",98,78,100);
		student5.calculateAvarege();
}


	public void calculateAvarege() {
	int average=(grade1+grade2+grade3)/3;
		System.out.println("Student "+name+" has an avarage grade of "+average);
		
	}
	
	public void hello() {
		System.out.println("hello"+grade1);
	}
	
}
