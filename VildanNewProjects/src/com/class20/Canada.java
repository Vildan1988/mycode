package com.class20;

public class Canada {
	public static void main(String[] args) {
		USA us1=new USA();
		System.out.println("Access from inside Canada class ");
		
		System.out.println(us1.mainState);
		System.out.println(us1.school);
		//System.out.println(us1.capitalCity);we cannot print because it is private
		
		
		
		
	}

}
