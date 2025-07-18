package com.MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		//From
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("srcDest")).sendKeys("esplanade");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div")).click();
		
		//To
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[1]/div/div")).click();
		driver.findElement(By.id("srcDest")).sendKeys("Sili");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/div")).click();
        //calander
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[1]/div/span[2]")).click();
		Thread.sleep(1000);
		WebElement month = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/div/div"));
		WebElement nextArrow = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/div/i[2]"));
		 
		/*String emonth = "Dec";
		String eday = "11";*/
		
		while(!month.getText().contains("Dec"))
		//while(!month.getText().contains(emonth))
		nextArrow.click();
		
		//driver.findElement(By.xpath("//span[contains(text), \""+eday+"\")]"))
	
	    //driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[1]/div[3]/div[3]/div[2]/div/ul/li[32]/div/div/span")).click();
	}

}
