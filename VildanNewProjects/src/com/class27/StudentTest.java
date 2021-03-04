package com.class27;

public class StudentTest {
	public static void main(String[] args) {
		
		SyntaxStudent ss=new SyntaxStudent();
		ss.study();
		//ss.doHomework();compile error not visible since method inside parent is private
		ss.attendClasses();
		ss.research();
		
		Student student=new SyntaxStudent();
		student.study();
		student.research();
		student.attendClasses();
		//student.doHomework();compile error not visible since method inside parent is private
	}

}
