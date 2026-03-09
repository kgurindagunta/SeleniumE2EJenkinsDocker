package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.enums.FrameworkData;
import com.utils.PropertyFileUtil;
import com.webDriver.Driver;
import com.webDriver.DriverManager;

public class BaseTest {
	
	@BeforeMethod
	public void setup() {
		Driver.initDriver("chrome");
		//DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		DriverManager.getDriver().get(PropertyFileUtil.getPropertyFileValue(FrameworkData.URL));
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.closeDriver();
	}

}
