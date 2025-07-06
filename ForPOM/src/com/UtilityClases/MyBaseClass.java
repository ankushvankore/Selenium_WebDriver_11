package com.UtilityClases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class MyBaseClass {
	protected static WebDriver driver;
	protected static EnterVehicleData vd;
	protected static HomePage p1;
	protected static EnterInsurantData id;
	
	@BeforeSuite
    public void beforeSuite() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://sampleapp.tricentis.com/101/index.php");

        // initialize page objects
        p1 = new HomePage(driver);
        vd = new EnterVehicleData(driver);
        id = new EnterInsurantData(driver);
    }

    @AfterSuite
    public void afterSuite() {
        driver.quit();
    }
}
