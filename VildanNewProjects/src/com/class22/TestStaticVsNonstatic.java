package com.class22;

public class TestStaticVsNonstatic {
	public static void main(String[] args) {
		
		/* how to access static members
		 * they can be access by className 
		 */
		
		
	System.out.println(StaticVsNonStatic.school);	
	StaticVsNonStatic.getInfo1();
	
	/* how to access non static members
	 * they can be access by  creating an object of that class
	 */
	StaticVsNonStatic obj=new StaticVsNonStatic(); //eger nonstatic bi degere ulasmaya calisiyorsan obj olusturmak zorundasin.
	
	obj.name="John";
	obj.grade='A';
	obj.getInfo();
	
	//obj.getInfo1();possible but not preferable
	
	
		
	}

}
