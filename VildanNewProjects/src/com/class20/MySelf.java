package com.class20;

public class MySelf {
	
public static void main(String[] args) {

	
	MySonMath son1 = new MySonMath();
	son1.name="ensar";
	son1.add1();
	
	son1.add2(2,3);
	
	int result=son1.add3();
	//System.out.println(result);
	
	int result4=son1.add4(5,7);
	
	
	//son1.add5(); it is not visible because this method  is private.
	
	MySelf myself=new MySelf();
	
	boolean good=myself.checkResult(12, result4);
	if (good) {
		System.out.println("good " + son1.name);
	}else {
		System.out.println("it is not enough");
	}
	
	
	//if (result4==12) {
	//	System.out.println("good job");
	//}else {
        
	//}
}
	boolean checkResult(int myResult, int mySonResult) {
		boolean isOk=false;
		if (myResult==mySonResult) {
			isOk=true;
	    }else {
		    isOk=false;
	    }
	       return isOk;
}
}
