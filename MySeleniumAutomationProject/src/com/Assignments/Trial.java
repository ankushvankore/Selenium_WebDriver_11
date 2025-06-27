package com.Assignments;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trial {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("\tBefore Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("\tAfter Method");
	}
	
	@Test
	public void test1() {
		System.out.println("\t\tTest 1");
	}
	@Test
	public void test2() {
		System.out.println("\t\tTest 2");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
}
