package com.class27;

public class FinalKeyword {
	
	public final String str="hello"; 
	
	public static void main(String[] args) {
		
		String str="I am awsome";
		str="I am cool";
		System.out.println(str);
		
		final String  finalString="Java is easy";
		//finalString="java is hard"; cannot modify final variable
		
		final int age=120;
		//age=100;compiler error
		
		
		FinalKeyword obj=new  FinalKeyword();
		System.out.println(obj.str);
	
	}

	public final void hello() {
		System.out.println("I am final method in parent class");
	}
	public final void hello(int num) {
		System.out.println("I am final method in parent class");
		}
	//can we overload a final method? yes change paramatre
	
}
	//class FinalKeywordChild  extends FinalKeyword{
	
	//public final void hello() { -->final methods cannot be overriden, we will get compiler eroor
	//	System.out.println();
	//}
	
	//}
	
	
	

