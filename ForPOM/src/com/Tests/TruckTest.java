package com.Tests;

import org.testng.annotations.Test;

import com.UnderstandAccessModifiers.MyDate;
import com.UtilityClases.EnterVehicleData;
import com.UtilityClases.HomePage;
import com.UtilityClases.MyBaseClass;

import org.testng.annotations.BeforeClass;

public class TruckTest extends MyBaseClass {

	@Test
	public void truckTest() {
		vd.selectMake("Audi");
		vd.setEnginePerformance("1000");
		vd.setPayload("1000");
	}

	@BeforeClass
	public void beforeClass() {
		//p1 = new HomePage(driver);
		System.out.println(driver);
		p1.TruckLink();

		//vd = new EnterVehicleData(driver);
		
	}

}
