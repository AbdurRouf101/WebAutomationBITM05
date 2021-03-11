package com.OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseClass;

public class RegisterTest extends BaseClass {

	
	

	public static void main(String[] args) throws InterruptedException {
		
		launchChrome();
		openHomePage();
		openRegisterPage();
		TC_03_RegisterTest();
		
		closeBrowser();	

	}
	
	public static void openRegisterPage() throws InterruptedException {
		
		WebElement MyAccount=driver.findElement(By.cssSelector("#top-links > ul > li.dropdown > a > span.hidden-xs.hidden-sm.hidden-md"));
		MyAccount.click();
		Thread.sleep(4000);
		
		WebElement Register=driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
		Register.click();
		Thread.sleep(4000);
		
		String RegisterPageTitle= driver.getTitle();
		System.out.println("Title: " + RegisterPageTitle);
		
		String RegisterURL=driver.getCurrentUrl();
		System.out.println("URL: " + RegisterURL);
		
	}
	
	public static void TC_03_RegisterTest() throws InterruptedException {
		
		WebElement FirstName=driver.findElement(By.id("input-firstname"));
		FirstName.clear();
		FirstName.sendKeys("smaawbdur");
		Thread.sleep(3000);
		
		WebElement LastName=driver.findElement(By.id("input-lastname"));
		LastName.clear();
		LastName.sendKeys("bhuaiwyan");
		Thread.sleep(3000);
		
		WebElement Email=driver.findElement(By.id("input-email"));
		Email.clear();
		Email.sendKeys("smaadrb@gmail.com");
		Thread.sleep(3000);
		
		WebElement Telephone=driver.findElement(By.id("input-telephone"));
		Telephone.clear();
		Telephone.sendKeys("01720995448");
		Thread.sleep(3000);
		
		
		WebElement Password=driver.findElement(By.id("input-password"));
		Password.clear();
		Password.sendKeys("123458");
		Thread.sleep(3000);
		
		WebElement PasswordConfirm=driver.findElement(By.id("input-confirm"));
		// WebElement passwordConfirm=driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));					
		PasswordConfirm.clear();
		PasswordConfirm.sendKeys("123458");
		Thread.sleep(3000);
		
		WebElement radio1=driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input"));
		radio1.click();
		Thread.sleep(3000);
		
		WebElement checkbox1=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
		checkbox1.click();
		Thread.sleep(2000);
		
		WebElement buttonContinue=driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
		buttonContinue.click();
		Thread.sleep(4000);
				
		
	}
	
	
	
	
}
