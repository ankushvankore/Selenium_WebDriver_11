package com.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MenuTrial {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.hirist.tech/k/analytics-jobs?ref=homepagetag");
		
		List<WebElement>menus = driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/header/div/div/div[3]/div/div[1]/div/div/div/a/button"));
		
		
	}

}
