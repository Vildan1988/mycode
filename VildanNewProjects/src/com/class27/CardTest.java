package com.class27;

public class CardTest {
	public static void main(String[] args) {
		
		//primitive 
		int i=10;
		//non primitive
		String str="hello";
	    MC mc;
	    
		
		//take an object of the child class and give reference to the parent
		//   reference variable=object is created
		
		
		Card card= new AX();
		card.chargeInterest();//from parent class
		card.creditLimit();//from child class
		
		Card card1=new MC();
		card1.creditLimit();
		
		Card card2=new Visa();
		card2.creditLimit();
		System.out.println("________________________________________");
		
		//type [] arrayName={};
		//type [] arrayName=new type[];
		
		int[] numArray= {10,12,13};
		String[] stringArray= {"aa","bb"};
		
		// 1 we created objects and assigned to the variables and then stored those variables inside the array
		Card[] cardArray= {card,card1,card2};
		
		//creating an objject and storing it directly into anArray of Cards
		Card[] cardArray1= {new MC(), new AX(), new Visa(), new Discovery()};
		
		//cardArray[0]-->MC
		//cardArray[3]-->discovery
		
		for(Card myCard:cardArray1) {
			myCard.creditLimit();
			myCard.chargeInterest();
		}
		for (int y=0; y<cardArray1.length; y++) {
			cardArray1[1].creditLimit();
		}
		 
		System.out.println("_________________________creating objects of each class________ ");
	
		
		Card c1=new Card();
		c1.chargeInterest();
		c1.creditLimit();
		
		AX ax1=new AX();
		ax1.chargeInterest();
		ax1.creditLimit();
		
		MC mc1=new MC();
		mc1.cashBack();
		mc1.chargeInterest();
		mc1.creditLimit();
		
		MC mc2=new MC();
		MC mc3=new MC();
		
		
		Card cc=new MC();
		cc.chargeInterest();
        cc.creditLimit();
        
        System.out.println("____________________creating an array that will hold only MC types");
        
        MC[] masterCard= {mc1,mc2,mc3};
        for (MC mCard:masterCard) {
        	mCard.chargeInterest();
        	mCard.creditLimit();
        	mCard.cashBack();
        }
        
        
}}
