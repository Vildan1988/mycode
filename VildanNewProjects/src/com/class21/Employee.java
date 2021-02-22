package com.class21;

public class Employee {
	
	// with default values
	
	  int eID=5;
		 int salary=200;
		static String CEO="Sumair";
		
		
		void printInfo() {
			System.out.println("Employee Id: "+ eID + ", salary is: " + salary + "CEO is: "+CEO);
		}
		
		public static void main(String[] args) {
			Employee.CEO= "Sumair";
			
			
			Employee emp1=new Employee();
			
			emp1.printInfo();
			
			
			Employee emp2=new Employee();
			emp2.printInfo();
			
			System.out.println("Let's change emp2 ");
			
			emp2.eID=3;
			emp2.salary=400;
			emp2.CEO="asel";
			emp2.printInfo();
			emp1.printInfo();
			
			
		}
		
		
		
		
		
	

	
	

}
