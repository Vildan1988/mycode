package com.class22;

public class AccessModifiersTest {
public static void main(String[] args) {// ayni class icinde gorunenler 
	
	AccesingModifiers.hello();//heryerden accessable 
	AccesingModifiers.hello1();
	AccesingModifiers.hello2();
	
	//AccesingModifiers.hello3();      not acceptable since permission is set to private
	
}

}
