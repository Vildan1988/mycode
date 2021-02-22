package com.class26;

public class WebDriverTest {
	
	public static void main(String[] args) {
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.open();
		chrome.refresh();
		
		System.out.println("_____________________________");
		
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.open();
		firefox.refresh();
		firefox.getTitle();
		
		System.out.println("_____________________________");   //run time polimorphism
		//creating an object of child class and gives and reference to the parent class
		WebDriver driver=new FirefoxDriver();
		driver.open(); //from child
		driver.refresh();//from parent
		//driver.getTitle(); no access to child specific class through parent type
		
	}

}
