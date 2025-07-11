package com.MyTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadFromExcel {

	@DataProvider
	public String[][] getData() throws IOException{
		String fPath = "D:\\AViIT\\Demos\\Selenium_11\\MySeleniumAutomationProject\\ExcelFiles\\LoginData.xlsx";
		File file = new File(fPath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		String[][]loginData = new String[sheet.getPhysicalNumberOfRows()][3];
		
		for(int i = 0; i < sheet.getPhysicalNumberOfRows(); i++)
		{
			for(int j = 0; j < 3; j++)
			{
				loginData[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		wb.close();
		fis.close();
		
		return loginData;
	}

}
