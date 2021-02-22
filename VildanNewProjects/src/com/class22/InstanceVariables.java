package com.class22;

public class InstanceVariables {
	
	String name="Samir";  //instance... yazilmasi icin asagida ob olusturman lazim
	
	
	
	
	
	
	
	
   public static void main(String[] args) {
	
	String name="burcu"; //local
	System.out.println(name);
	
	
	InstanceVariables obj=new InstanceVariables();
	System.out.println(obj.name);
	
	//changing value of the instance variable
	obj.name="john";
	System.out.println(obj.name);
	
	//creating a new instance of class InsatanceVariables
	InstanceVariables obj1=new InstanceVariables(); //ob de degisiklik yapmazsan basta verdigin degeri yazar otomatik
	//obj1.name="vildan";
	System.out.println(obj1.name);
	//value will be Samir 
	
	
}
}
