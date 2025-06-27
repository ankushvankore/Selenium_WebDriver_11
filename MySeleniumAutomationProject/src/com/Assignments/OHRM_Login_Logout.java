package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OHRM_Login_Logout {
	WebDriver driver;

	@Test
	public void loginToOHRM1() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Test
	public void loginToOHRM2() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Test
	public void loginToOHRM3() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("pravin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("pravin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@AfterMethod
	public void logout() {
		if (driver.getCurrentUrl().contains("dashboard")) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText());
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
