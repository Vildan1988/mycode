package com.class22;

public class AccesingStaticVariables {

	public static void main(String[] args) {
		
		Husky obj=new Husky();
		
		System.out.println(obj.name);
		
		obj.name="Sharik";
		
		System.out.println(obj.name);
		
		
		
		System.out.println(Husky.breed);
		
		Husky.breed="New Breed";
		
		System.out.println(obj.breed);//possible but not preferable
	}
}
