package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/MyCucumberProject/MyCucumberProject/F03TiraBeauty.feature", 
					glue = {"com.StepDef", "com.ForHooks"},
					tags = "@AllTests")		
public class R03TiraBeauty {
	/*
	 Execute Single Scenario		tags = "@MenTest"
	 Execute Multiple Scenarios		tags = "@MenTest or @SkinTest"
	 Skip Single Scenario			tags = "not @MakeupTest"
	 Skip Multiple Scenarios		tags = "not @MakeupTest and not @MomnBabyTest"
	 Execute All Scenarios			tags = "@AllTests"
	 
	 */
}
