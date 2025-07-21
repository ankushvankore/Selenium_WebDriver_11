package com.StepDef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class S03TiraBeauty {
	public static WebDriver driver;
	
	@Given("Launch {string}")
	public void launch(String url) {
	}

	@When("I Click on Makeup link")
	public void i_click_on_makeup_link() {
	    driver.findElement(By.linkText("Makeup")).click();
	}

	@Then("Makeup page should display")
	public void makeup_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("makeup"));
	}

	@When("I Click on Skin link")
	public void i_click_on_skin_link() {
		driver.findElement(By.linkText("Skin")).click();
	}

	@Then("Skin page should display")
	public void skin_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("skin"));
	}

	@When("I Click on Men link")
	public void i_click_on_men_link() {
	    driver.findElement(By.linkText("Men")).click();
	}

	@Then("Men page should display")
	public void men_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("men"));
	}

	@When("I Click on Mom & Baby link")
	public void i_click_on_mom_baby_link() {
	    driver.findElement(By.partialLinkText("Mom")).click();
	}
	
	@Then("Mom & Baby page should display")
	public void mom_baby_page_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("mom"));
	}
}
