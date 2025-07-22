package com.ForHooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import static com.StepDef.S03TiraBeauty.*;

public class RediffHooks {
	//@Before
	public void launchbrowser() {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	    driver.get("https://www.tirabeauty.com/");
	}
	//@After
	public void closeBrowser()
	{
		driver.close();
	}
}
