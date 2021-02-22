package com.class24;

public class Constructor {
	
	 Constructor(){
		System.out.println("hello");
	}
	
	void Constructor(){
		System.out.println("I am a constructor"); //void yazip obj eklersen sonuc alirsin yazmazsan sadece hello gelir
	}
	
	public static void main(String[] args) {
	
		Constructor obj=new Constructor();
		obj.Constructor();
}
	
}
