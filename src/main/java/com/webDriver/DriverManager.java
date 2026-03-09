package com.webDriver;

import org.openqa.selenium.WebDriver;

public final class DriverManager {
	
	private DriverManager() {
		
	}
	
	private final static ThreadLocal<WebDriver>driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	public static void setDriver(WebDriver rDriver) {
      driver.set(rDriver);		
	}
	
	public static void removeDriver() {
		driver.remove();
	}


}
