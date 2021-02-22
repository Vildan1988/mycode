package com.class24;

public class Country {
	
	
	public String capital,name; //main methodun disinda class icinde istedigin yere yazabilirsin 
	
	public int population;
	
	
	
	public Country(){ // you can use access modifiers public,private,protected gibi
		
		System.out.println("I am non argument constructor");
	}
	
	
	
	Country(String countryName, String countryCapital, int countryPopulation){         //Country(String name, String Capital, int Population){
																					   //this.name=countryName;
																					   //this.capital=countryCapital;
																					   //this.population=countryPopulation;  this keyword kullanmalisin aynini yazarsan
		name=countryName;
		capital=countryCapital;
		population=countryPopulation;													
		
	}
	
	Country(String name, String capital){
		this.name=name;
		this.capital=capital;
	}
	
	
		
	public void displayInfo() {
		
		System.out.println(name+ " "+capital);
	}
		
		
	public static void main(String[] args) { //main method we testing the code
		
		
		//Country country1=new Country();  // eger any costructor eklemediysen bunu kullanirsin
		//country1.name="USA";
		//country1.capital="Washington DC";
		
		
		//Country country2=new Country();
		//country2.name="Turkiye";
		//country2.capital="Ankara";
		
		
		Country country1=new Country("USA", "Washington DC"); // one line you can do all the other
		country1.displayInfo();
		
		Country country2=new Country("Turkiye", "Ankara",80);
		Country country3=new Country();		
		
		
		country2.displayInfo();
		country3.displayInfo();
		
		//System.out.println(country1.name);  //herhengi bir method kullanmadiysan bunu kullanirsin
		//System.out.println(country1.capital);
		
		//System.out.println(country2.name);
		//System.out.println(country2.capital);
		
		//System.out.println(country3.name);
		//System.out.println(country3.capital);
		
	}
	

}
