package com.class20_other;

//import com.class20.MySonMath;
//import com.class20.USA;

import com.class20.*;

public class Mexico {
	public static void main(String[] args) {
		
		//when  USA public
		//USA us2=new USA();
		
		System.out.println("Access from inside Mexico class ");
		
		//System.out.println(us2.mainState);
		//System.out.println(us2.school); error because it is protected
		//System.out.println(us2.capitalCity);error because it is private
		
		//when USA is default 
		//i can not access USA class
		//USA us3=new USA();
		// System.out.println(us3.mainState);
		
		
		MySonMath son=new MySonMath();
		son.add1();
		
		
	}

}
