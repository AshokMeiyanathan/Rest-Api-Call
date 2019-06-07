package com.qa.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DeomTest {

	@Test
	public void sum(){
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
