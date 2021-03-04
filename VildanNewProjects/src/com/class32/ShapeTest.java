package com.class32;


/* create an interface 'shape' with undefined methods as calculate area and calculatePerimiter.
 * create 2 child classes:
 * circle & Square that should have an implementation of area and perimeter calculation. test your code 
 */

     interface Shape{
	
	void calculateArea(double num);
	void calculatePerimiter(double num);
}
     
     class Circle implements Shape {

		@Override
		public void calculateArea(double num) {
			System.out.println(3.14*(num*num)); 
			
		}

		@Override
		public void calculatePerimiter(double num) {
			System.out.println((3.14*2)+num);
			
		}
    	 
     }
     
     class Square implements Shape {

		@Override
		public void calculateArea(double num) {
			System.out.println(num*num);
			
		}

		@Override
		public void calculatePerimiter(double num) {
			System.out.println(num*4);
			
		}
    	 
     }

public class ShapeTest {
	
	public static void main(String[] args) {
		
		Shape shape=new Circle();
		shape.calculateArea(10);
		shape.calculatePerimiter(10);
		
		Shape shape1=new Square();
		shape1.calculateArea(6);
		shape1.calculatePerimiter(4);
	}

}
