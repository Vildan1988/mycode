package com.class27;
/*define a class card with in 2 methods and this class 
 * should have 4 subclasses in which some behavior can be overriding and some can 
 * implement it is on behavior 
 */

     public class Card {
    	 
    	 public void chargeInterest() {
    		 System.out.println("Card charges 25% interest");
    	 }
    	 public void creditLimit () {
    		 System.out.println("Credit limit of the card is 5000");//overridden 
    	 }
    	 
    	 

}
class AX extends Card{
	
	public void creditLimit() {
		System.out.println("Credit limit of the AX card is 25000"); //overriding method
	}
	
}

class MC extends Card{
	
	public void creditLimit() {
		System.out.println("Credit limit of the MC card is 15000"); //overriding method
	}
	
	public void cashBack() {
		System.out.println("MC gives cash back of %3");
	}
	
}
class Visa extends Card{
	
	public void creditLimit() {
		System.out.println("Credit limit of the Visa card is 20000"); //overriding method
	}
	
}
class Discovery extends Card {
	
	public void applePay() {
		System.out.println("Discover can take apple pay");
	}
}





