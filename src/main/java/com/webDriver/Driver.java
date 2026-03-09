package com.webDriver;

import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public final class Driver {
	
	private Driver() {
		
	}


	public static void initDriver(String browser) {

		if(browser.equalsIgnoreCase("chrome")) {
			if(Objects.isNull(DriverManager.getDriver())) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless=new");   // REQUIRED
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--window-size=1920,1080");

				DriverManager.setDriver(new ChromeDriver(options));
			}
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			if(Objects.isNull(DriverManager.getDriver())) {
				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("-headless");
				DriverManager.setDriver(new FirefoxDriver(options));
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
