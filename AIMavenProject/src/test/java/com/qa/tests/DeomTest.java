package com.qa.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeomTest {

	@Test
	public void sum(){
		System.setProperty("webdriver.gecko.driver","C:\\Firefox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		int a=10;
		int b=10;
		System.out.println("Sum");
		Assert.assertEquals(20,a+b);
	}
	
	@Test
	public void minus(){
		int a=10;
		int b=10;
		System.out.println("Minus");
		Assert.assertEquals(0,a-b);
	}
}
