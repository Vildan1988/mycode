package com.class27;

public class Student {
	
	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.doHomework();
		stu.attendClasses();
		stu.research();
		stu.study();
		
	}
	
	   public void study() {
		System.out.println("Student needs to study");
	}
	   private void doHomework() {
		System.out.println("Students needs to do homework");
	}
	   protected void research() {
		System.out.println("Student needs to research");
	}
       void attendClasses() {
    	System.out.println("Students needs to do attend classes");
    }
}

class SyntaxStudent extends Student{
	
	//@Override ->we are not overriding, child class having it is own method doHomework.
	private void doHomework() {
		System.out.println("Students needs to do homework");
	}
	
	@Override
	 public void study() {
		System.out.println("Syntax student needs to study a lot");
	}
	@Override
	 public void research() {
		 System.out.println("Syntax Student needs to a lot of research");
	 }
	@Override
	 protected void attendClasses() {
	    	System.out.println("Syntax Students needs to do attend ALL classes");
	    }
}