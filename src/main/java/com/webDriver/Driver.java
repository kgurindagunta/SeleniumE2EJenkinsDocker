package com.webDriver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class Driver {
	
	private Driver() {
		
	}


	public static void initDriver(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {
			if(Objects.isNull(DriverManager.getDriver())) {
				DriverManager.setDriver(new ChromeDriver());
			}
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			if(Objects.isNull(DriverManager.getDriver())) {
				DriverManager.setDriver(new FirefoxDriver());
			}
		}
	}

	public static void closeDriver() {

		DriverManager.getDriver().quit();
		if(Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.removeDriver();
		}
	}


}
