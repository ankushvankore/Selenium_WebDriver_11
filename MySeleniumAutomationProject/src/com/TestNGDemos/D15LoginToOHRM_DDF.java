package com.TestNGDemos;

import org.testng.annotations.Test;

import graphql.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.hssf.util.HSSFColor.HSSFColorPredefined;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D15LoginToOHRM_DDF {
	String fPath = "ExcelFiles/LoginData.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	XSSFCellStyle style;
	XSSFFont font;
	int i = 1;
	
	WebDriver driver;
	
	@Test(dataProvider = "getLoginDetails")
	public void loginToOHRM(String un, String ps) {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dash"));
	}
	@AfterMethod
	public void logout() {
		row = sheet.getRow(i);
		cell = row.getCell(2);
		
		style = wb.createCellStyle();
		font = wb.createFont();
		
		if (driver.getCurrentUrl().contains("dashboard")) {
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.partialLinkText("Log")).click();
			System.out.println("Test case pass");
			
			font.setBold(true);
			font.setColor(HSSFColorPredefined.GREEN.getIndex());
			style.setFont(font);
			
			cell.setCellStyle(style);
			cell.setCellValue("Pass");
		} 
		else 
		{
			System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).getText());
			
			font.setItalic(true);
			font.setColor(HSSFColorPredefined.RED.getIndex());
			style.setFont(font);
			
			cell.setCellStyle(style);
			cell.setCellValue("Fail");
		}
		i++;
	}


	@DataProvider
	public Object[][] getLoginDetails() {
		int rows = sheet.getPhysicalNumberOfRows();
		String[][]loginData = new String[rows-1][2];
		
		for(int i = 0; i < rows-1; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				String data = sheet.getRow(i+1).getCell(j).getStringCellValue();
				loginData[i][j] = data;
			}
		}
		return loginData;
	}
	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
		fos = new FileOutputStream(file);
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.write(fos);
		wb.close();
		fis.close();
		
		driver.close();
	}

}
