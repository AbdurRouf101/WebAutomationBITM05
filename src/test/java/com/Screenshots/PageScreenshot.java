package com.Screenshots;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Base.BaseClass;


public class PageScreenshot extends BaseClass {
	
  @BeforeTest 
  public void config() {
	  launchChrome();
	  openHomePage(); 
  }
	
  @Test
  public void generateScreenshot () throws IOException {
	  generateScreenshot(driver,"New Image");
	  generateScreenshot(driver,"New Image2");
  }
  
  @Test
  public void generateScreenshot2 () throws IOException {
	  generateScreenshot(driver,"New Image3");
	    }  
  
  
  @AfterTest
	public void closeTest() {
		closeBrowser();
	}
  
  
}
