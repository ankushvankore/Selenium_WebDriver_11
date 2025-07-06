package com.UtilityClases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData {
	WebDriver driver;

	public EnterVehicleData(WebDriver driver) {
		this.driver = driver;
	}
	public void selectMake(String make)
	{
		new Select(driver.findElement(By.id("make"))).selectByVisibleText(make);
	}
	public void setEnginePerformance(String ep)
	{
		driver.findElement(By.id("engineperformance")).sendKeys(ep);
	}
	
	
	//Other methods
	//Truck
	public void setPayload(String pl)
	{
		driver.findElement(By.id("payload")).sendKeys(pl);
	}
	public void setRightHandDrive(boolean drive)
	{
		if(drive == true)
			driver.findElement(By.id("righthanddriveyes")).click();
		else
			driver.findElement(By.id("righthanddriveno")).click();
	}
	public void next()
	{
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}
}
