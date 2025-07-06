package com.Tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.UtilityClases.EnterInsurantData;
import com.UtilityClases.EnterVehicleData;
import com.UtilityClases.HomePage;
import com.UtilityClases.MyBaseClass;

public class AutomobileTest extends MyBaseClass{
	
	
	@BeforeClass
	public void automobile()
	{
		p1.automobileLink();
		System.out.println(driver);
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println(driver);
	}
	
	@Test(dataProvider = "dp")
	public void automobileTest(Integer n, String s) {
		//p1.automobileLink();
		vd.selectMake("Audi");
		vd.setEnginePerformance("1000");
		vd.next();
		
		id.setFirstName("Pravin");
		id.selectHobbies(true, false, false, false, false);
	}

	@DataProvider(indices = 0)
	public Object[][] dp() {
		return new Object[][] 
				{ 
					new Object[] { 1, "a" }, 
					new Object[] { 2, "b" }, 
				};
	}
	
	/*
	 * @Test public void truckTest() { p1.TruckLink();
	 * 
	 * vd.selectMake("Audi"); vd.setEnginePerformance("1000");
	 * vd.setPayload("1000"); }
	 */

	

}
