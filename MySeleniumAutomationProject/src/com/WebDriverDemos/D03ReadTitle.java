package com.WebDriverDemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D03ReadTitle {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		//if(title.equals("Daily Gainers: BSE, NSE, Stock quotes, share market, stock market, stock tips: Rediff Stocks"))
		if(title.contains("Daily Gainers"))
			System.out.println("Test case pass");
		else
			System.out.println("Test case fail");
		
		driver.close();
	}

}
