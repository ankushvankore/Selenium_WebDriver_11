package com.UtilityClases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class EnterInsurantData {
	WebDriver driver;

	public EnterInsurantData(WebDriver driver) {
		this.driver = driver;
	}
	public void setFirstName(String fn)
	{
		driver.findElement(By.id("firstname")).sendKeys(fn);
	}
	public void selectHobbies(boolean speeding, boolean bungeeJ, boolean cliffD, boolean skyD, boolean other)
	{
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, 200)", "");
		
		if(speeding)
			((JavascriptExecutor)driver).executeScript("arguments[0].click()", driver.findElement(By.id("speeding")));
		
		if(bungeeJ)
			((JavascriptExecutor)driver).executeScript("arguments[0].click()", driver.findElement(By.id("")));
		
		if(cliffD)
			driver.findElement(By.id("cliffdiving")).click();
		
		if(skyD)
			driver.findElement(By.id("skydiving")).click();
		
		if(other)
			driver.findElement(By.id("other")).click();
	}
	
}
