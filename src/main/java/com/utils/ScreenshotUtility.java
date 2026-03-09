package com.utils;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.webDriver.DriverManager;

public class ScreenshotUtility {
	
	
	public static String captureScreenshot() {
		TakesScreenshot screen = (TakesScreenshot)DriverManager.getDriver();
		return screen.getScreenshotAs(OutputType.BASE64);
	}

}
