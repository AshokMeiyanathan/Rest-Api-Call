package com.qa.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class DeomTest3 {

	@Test
	public void sum(){
		int a=10;
		int b=10;
		System.out.println("Sum3");
		Assert.assertEquals(20,a+b);
	}
	
	@Test
	public void minus(){
		int a=10;
		int b=10;
		System.out.println("Minus3");
		Assert.assertEquals(0,a-b);
	}
}
