package com.class18;

public class Hello {
	
	void sayHello(String name) {
		System.out.println("Hello "+name);
	}

	public static void main(String[] args) {
		
		Hello obj=new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Wegas");
		obj.sayHello("Diego");
		
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Russia");
		obj.sayHelloDifferentLanguage("Turkey");
		obj.sayHelloDifferentLanguage("Paraguay");
		obj.sayNameAndAge("jack", 45);
		obj.sayNameAndAge("Olga",50);
		obj.isSnowing(true);
		obj.isSnowing(false);
		
		//obj.sayHelloDifferentLanguage(123);you will get compile time error because it is int
	}
	/*create a method that will say hello in different language based
	 * on the value that will be passed when user calls a method
	 */
	
	void sayHelloDifferentLanguage(String country) { //with parameter
		
		
		switch(country.toLowerCase()) {
		case"usa":
			System.out.println("Hello");
			break;
		case"Russia":
			System.out.println("Privet");
			break;
		case"paraguay":
			System.out.println("Hola");
			break;
		case"albania":
			System.out.println("Pershendetje");
			break;
			default:
				System.out.println("I dont know how to say Hello inyour language ");
		
		}
	}
	
	//method to say name and age
	
	void sayNameAndAge(String name,int age) {
		System.out.println("My name is "+name+ " and I am "+age+" years old");
	}
	//create a method that will check if it snowing 
	//if snow -->stay at home , otherwise go for a walk
	
	void isSnowing(boolean isSnowing) { //method header
		
		//method body
		if (isSnowing) {
			System.out.println("Stay Home");
		}else {
			System.out.println("Go for a walk");
		}
		
	}
	
	
	
	
	
	
	
	
	
}
