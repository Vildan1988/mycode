package com.class16;

public class IQ7 {
	public static void main(String[] args) {
		
		/*write a java program to check whether a given number is prime or not?
		 * prime number; is a number that has to meet 2 conditions
		 * it should be divisible by 1 and by itself only
		 * 2,3,5,7,11,13,17,19,23
		 */
		
		// take range of numbers from 1 to 100 and print all prime
		//2,3 (2,3), 4(2,3,4), 5(2,3,4,5), 6(2,3,4,5,6)
		
		
		
		int num=5;
		boolean isPrime=true;
		
		if (num ==0 || num==1) {
			isPrime=false;
		}else {
			
		
		
		for (int i=2; i<num; i++) {
			
			if (num%i==0) {
				isPrime=false;
				break;	
			}
		}}
		
		if (isPrime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not prime number");
		}
		
		
		
		
		
	}

}
