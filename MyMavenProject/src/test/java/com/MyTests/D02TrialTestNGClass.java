package com.MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class D02TrialTestNGClass {
	WebDriver driver;
	@Test
	public void trialTest() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
