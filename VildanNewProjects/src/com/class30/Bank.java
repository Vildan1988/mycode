package com.class30;

public interface Bank {
	
	void haveChecking();
	void haveSaving();

}
interface Trustable{
	void trust();
}

class Finance{
	public void financing() {
		System.out.println("Financial transaction must happen");
	}
}

class BOA extends Finance implements Bank, Trustable {

	@Override
	public void haveChecking() {
		System.out.println("BOA has a checking account");
		
	}

	@Override
	public void haveSaving() {
		System.out.println("BOA has saving account");
		
	}

	@Override
	public void trust() {
		System.out.println("you can trust BOA with your money");
		
	}
	
}

class CapitalOne extends Finance implements Bank, Trustable{

	@Override
	public void haveChecking() {
		System.out.println("CapitalOne has a checking account");
		
	}

	@Override
	public void haveSaving() {
		System.out.println("CapitalOne has saving account");
		
	}

	@Override
	public void trust() {
		System.out.println("you can trust CapitalOne with your money");
	}
	
}

class CapitalOneChild extends CapitalOne{
	
}







