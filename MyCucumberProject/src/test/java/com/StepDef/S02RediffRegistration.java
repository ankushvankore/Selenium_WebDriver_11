package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S02RediffRegistration {
	WebDriver driver;
	@Given("Open rediff registration page")
	public void open_rediff_registration_page() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@When("I enter valid fullName as {string}")
	public void i_enter_valid_full_name_as(String fn) {
	    driver.findElement(By.xpath("//input[@placeholder=\"Enter your full name\"]")).sendKeys(fn);
	}

	@When("I enter valid rediffid as {string}")
	public void i_enter_valid_rediffid_as(String rid) {
		driver.findElement(By.xpath("//input[starts-with(@name, \"login\")]")).sendKeys(rid);
	}

	@When("I Enter valid password as {string}")
	public void i_enter_valid_password_as(String password) {
		driver.findElement(By.xpath("//input[starts-with(@name, \"pass\")]")).sendKeys(password);
	}

	@When("I reenter valid password as {string}")
	public void i_reenter_valid_password_as(String ps) {
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(ps);
	}

	@When("I Click on check Availablity button")
	public void i_click_on_check_availablity_button() {
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[4]/input")).click();
	}

	@Then("Rediff id available message should display")
	public void rediff_id_available_message_should_display() {
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div")).getText());
	}

	@When("I enter invalid fullName as {string}")
	public void i_enter_invalid_full_name_as(String fn) {
	    driver.findElement(By.xpath("//input[@placeholder=\"Enter your full name\"]")).sendKeys(fn);
	}

	@When("I enter invalid rediffid as {string}")
	public void i_enter_invalid_rediffid_as(String rid) {
		driver.findElement(By.xpath("//input[starts-with(@name, \"login\")]")).sendKeys(rid);
	}

	@When("I Enter invalid password as {string}")
	public void i_enter_invalid_password_as(String password) {
		driver.findElement(By.xpath("//input[starts-with(@name, \"pass\")]")).sendKeys(password);
	}

	@When("I reenter invalid password as {string}")
	public void i_reenter_invalid_password_as(String ps) {
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys(ps);
	}

	@When("user click on check Availablity button")
	public void user_click_on_check_availablity_button() {
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[4]/input")).click();
	}

	@Then("Rediff id not available message should display")
	public void rediff_id_not_available_message_should_display() {
		System.out.println(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div")).getText());
		Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"check_availability\"]/div")).getText().contains("Available"));
	}

}
