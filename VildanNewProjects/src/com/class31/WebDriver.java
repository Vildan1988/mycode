package com.class31;


interface TakesScreenshot{
	
	//public static final
	String $FILE_EXTENSION="png";
	
	void takesScreen();
	
	//added from jdk 1.8
	static void takeSelfie() {
		System.out.println("I am define static method of TakeScreenshot interface ");
	}
	
	default void takePictures() {
		System.out.println("I am default define method of TakeScreenshot interface ");
		
	}
}	
	interface Application {
		void applicationTest();
	}

public interface WebDriver extends TakesScreenshot{
	
	void openBrowser();
	void closeBrowser();
	void maximazeWindow();
	void findElement();

}
abstract class Browser{
	
	String name;
    public abstract void refresh();
    
	}

class ChromeDriver extends Browser implements WebDriver, Application{

	@Override
	public void openBrowser() {
		System.out.println("Open chrome Browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Chrome Browser");
	}

	@Override
	public void maximazeWindow() {
		System.out.println("Maximize window in Chrome Browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find element by CCS selector");
		
	}

	@Override
	public void refresh() {
		System.out.println("Refresh Chrome Browser");
		
	}

	@Override
	public void takesScreen() {
		System.out.println("Take screenshot in chrome browser");
		
	}

	@Override
	public void applicationTest() {
    System.out.println("aplication test in chrome browser");		
	}
	
	
}

class FirefoxDriver extends Browser implements WebDriver,Application{

	@Override
	public void openBrowser() {
		System.out.println("Open Firefox Browser");
		
	}

	@Override
	public void closeBrowser() {
		System.out.println("Close Firefox Browser");
		
	}

	@Override
	public void maximazeWindow() {
		System.out.println("Maximize window in Firefox Browser");
		
	}

	@Override
	public void findElement() {
		System.out.println("Find element by XPath");
		
	}

	@Override
	public void refresh() {
		System.out.println("Refresh Chrome Browser");
		
	}

	@Override
	public void takesScreen() {
		System.out.println("Take screenshot in Firefox browser");
		
	}

	@Override
	public void applicationTest() {
		System.out.println("aplication test in Firefox browser");		
	}
	
}
