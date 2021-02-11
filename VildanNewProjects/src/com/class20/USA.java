package com.class20;

 class USA {
	
	private String capitalCity= "Washington DC";
	
	public String mainState= "New York";
	
	protected String school= "Syntax Tec";
	
	public static void main(String[] args) {
		
		USA us =new USA();
		
		System.out.println("Access from inside USA class ");
		System.out.println(us.mainState);	
		System.out.println(us.school);
		System.out.println(us.capitalCity);
	}
	
	

}
