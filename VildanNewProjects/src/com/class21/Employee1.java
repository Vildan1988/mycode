package com.class21;

public class Employee1 {
	
	

	int eID;
	int salary;
	static String CEO;
	
	
	void printInfo() {
		System.out.println("Employee Id: "+ eID + ", salary is: " + salary + "CEO is: "+CEO);
	}
	
	public static void main(String[] args) {
		
		Employee.CEO="Sumair";
		
		Employee emp3=new Employee();
		
		emp3.printInfo();
		
		emp3.eID=19;
		emp3.salary=80000;
        emp3.CEO="sumair";
        
        emp3.printInfo();
        
        Employee emp4=new Employee(); 
        emp4.eID=8;
		emp4.salary=85000;
        emp4.CEO="sumair";
        
        emp4.printInfo();
}
}