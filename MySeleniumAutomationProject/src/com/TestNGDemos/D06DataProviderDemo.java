package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D06DataProviderDemo {
	WebDriver driver;

	@Test(dataProvider = "getLoginData")
	public void loginToOHRM(String un, String ps) {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@DataProvider
	public Object[][] getLoginData() {
		/*
		 * return new Object[][] { new Object[] { "admin", "admin123" }, new Object[] {
		 * "pravin", "pravin123" }, new Object[] { "admin", "admin123" }, new Object[] {
		 * "vinayak", "vinayak123" }, };
		 */
		String[][] data = new String[][] { { "admin", "admin123" }, { "pravin", "pravin123" }, { "admin", "admin123" },
				{ "vinayak", "vinayak123" } };
		/*
		 * String[][]data = new String[4][2]; data[0] = new String[] {"admin",
		 * "admin123" }; data[1] = new String[] { "pravin", "pravin123" };
		 */

		return data;
	}

	

	@AfterMethod
	public void logout() {
		if (driver.getCurrentUrl().contains("dashboard")) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Test case pass");
		} else {
			System.out.println(driver
					.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"))
					.getText());
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
