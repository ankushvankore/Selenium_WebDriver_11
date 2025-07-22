package com.StepDef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

	@When("I select birth date as")
	public void i_select_birth_date_as(io.cucumber.datatable.DataTable dataTable) {
		List<String>data = dataTable.asList();
		/*System.out.println(data.get(0));
	    System.out.println(data.get(1));
	    System.out.println(data.get(2));*/

		new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Day\")]"))).selectByVisibleText(data.get(0));
		new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Month\")]"))).selectByVisibleText(data.get(1));
		new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Year\")]"))).selectByVisibleText(data.get(2));
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
	@When("User selectes birth date as")
	public void user_selectes_birth_date_as(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>>bDate = dataTable.asMaps();

		for(Map<String, String> bd : bDate) {
			new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Day\")]"))).selectByVisibleText(bd.get("Day"));
			new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Month\")]"))).selectByVisibleText(bd.get("Month"));
			new Select(driver.findElement(By.xpath("//select[starts-with(@name, \"DOB_Year\")]"))).selectByVisibleText(bd.get("Year"));
		}
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
