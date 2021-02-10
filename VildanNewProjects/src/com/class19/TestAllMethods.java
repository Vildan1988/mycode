package com.class19;

public class TestAllMethods {
	public static void main(String[] args) {
		// find the largest number of from 300 and 500
		//then identify is the large number 
		
		AllMethods obj=new AllMethods();
		int large=obj.findLargest(300,500);
		System.out.println(large);
		boolean odd=obj.isOdd(large);
		System.out.println(odd);
		
		
		
		//call method weekDayName if (tuesday,wendesday,thursday,sunday)-->i am learning java

		String day=obj.weekDayName(5);
		
		if(day.equals("tuesday") || day.equals("wendesday") ||day.equals("thursday") ||
				day.equals("saturday")||day.equals("sunday")) {
			System.out.println("i am learning java");
		}else {
			System.out.println("i am practicing java");
		}
		
		
		
		
		
		}
	
	}
	
	
	


