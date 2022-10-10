package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	WebDriver driver;
	@Test
	public void facebook() {
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("logesh@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("logesh@123");
		driver.findElement(By.name("login")).submit();
		
		
	}
	@BeforeMethod
	public void beforeMethod() {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\loges\\OneDrive\\Desktop\\phase5\\msedgedriver.exe");
				WebDriver driver= new EdgeDriver() ;
	}
	@AfterMethod
	public void afterMethod() {
		driver.close();
		//driver = null;
	}
	
	
}
