package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D05FlipkartAssignment {
	WebDriver driver;
	JavascriptExecutor js;
	
	@Test(priority = 1)
	public void clickOnMobile() {
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[contains(text(), \"Mobile\")]")));
	}
	@Test(priority = 2)
	public void clickOnAppliences() {
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[contains(text(), \"Appliances\")]")));
	}
	@Test(priority = 3)
	public void clickOnFlight() {
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[contains(text(), \"Flight\")]")));
	}
	@Test(priority = 4)
	public void clickOnGrocary() {
		js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[contains(text(), \"Grocery\")]")));
	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.flipkart.com/");
		System.out.println("Title: " + driver.getTitle());
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Title: " + driver.getTitle());
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		js = (JavascriptExecutor) driver;
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

}
