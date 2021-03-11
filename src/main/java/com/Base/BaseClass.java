package com.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass {
	
	public static WebDriver driver;
	
	
	public static void launchChrome() {
		// System.setProperty("webdriver.chrome.driver", "F:\\Training\\Tools\\chromedriver.exe");	
		// This was changed after maven used
		
		// 1st way 
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			
		// 2nd way, we got problem, forget this; use the 1st way above
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test/resources//chromedrive.exe");
		
				
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();	    
	    driver.manage().deleteAllCookies();
	}
	
	public static void launchFirefox() {
		// System.setProperty("webdriver.gecko.driver", "F:\\Training\\Tools\\geckodriver.exe");		Was before maven
		
		System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");  // added after maven
		
	    driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	}
	
	public static void closeBrowser() {
		
		driver.close();
	}
	
	public static void openHomePage() {
		driver.get("https://demo.opencart.com/");
	}


}
