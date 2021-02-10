package com.class18;

public class Recap {
	
	int students,classRooms,salary;
	String classes,Title,website,instructor,schoolName;
	
	void study() {
		System.out.println("Students studying "+classes+ " with "+instructor );
	}
    void teach() {
    	System.out.println("Dr.Bilal teaching "+classes);
    }
    void salary() {
    	System.out.println("Teachers can earn annual "+salary );
    }
    void schoolName() {
    	System.out.println("You can take "+classes+ " and religious class from "+schoolName);
    }
    
    public static void main(String[] args) {
    	
    	Recap school=new Recap();
    	school.classes="Quran";
    	school.instructor="Dr. Bilal";
    	school.salary=75;
    	school.schoolName="Respect Graduaded School";
    	
    	school.schoolName();
    	school.teach();
    	school.study();
		school.salary();
	}
}
