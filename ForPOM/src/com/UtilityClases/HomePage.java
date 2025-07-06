package com.UtilityClases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends MyBaseClass{
	

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void automobileLink()
	{
		driver.findElement(By.linkText("Automobile")).click();
	}
	public void TruckLink()
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click()", driver.findElement(By.linkText("Truck")));
	}
	public void MotorcycleLink()
	{
		driver.findElement(By.linkText("Motorcycle")).click();
	}
	public void camperLink()
	{
		driver.findElement(By.linkText("Camper")).click();
	}
}
