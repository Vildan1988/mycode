package com.class17;

public class Phone2 {
	public static void main(String[] args) {

    	Phone phon1=new Phone();
    	phon1.name="iPhone";
    	phon1.make="Apple";
    	phon1.model="iPhone 12";
    	phon1.color="black";
    	phon1.memory=2;
    	
    	Phone phon2=new Phone();
    	
    	phon2.name="Samsung";
    	phon2.make="Android";
    	phon2.model="S10";
    	phon2.color="white";
    	phon2.memory=3;
    	
    	Phone phon3=new Phone();
    	
    	phon3.name="Nokia";
    	phon3.make="bilmiyorum";
    	phon3.model="3310";
    	phon3.color="red";
    	phon3.memory=4;
    	
    	//phon3.playGames();
    	//phon3.speaking();
    	//phon3.listening();
    	
    	System.out.println(" I have "+phon3.color+ " "+phon3.name);  
	}

}
