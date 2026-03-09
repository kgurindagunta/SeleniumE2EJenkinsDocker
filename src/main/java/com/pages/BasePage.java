package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.enums.WaitStretegy;
import com.extentReports.ExtentLogger;
import com.factories.ExplicitWaitFactory;

public  class BasePage {
	
	
	protected static void enterInput(By by, String value, String inputname) {
		WebElement element =ExplicitWaitFactory.setWaitWithCondition(WaitStretegy.VISIBLE, by);
		element.sendKeys(value);
		ExtentLogger.extentLogOnPassWithImage(inputname +" is entered");
		
	}
	
	protected static void click(By by, String typeOfClick) {
		WebElement element =ExplicitWaitFactory.setWaitWithCondition(WaitStretegy.CLICKABLE, by);
		element.click();
		ExtentLogger.extentLogOnPassWithImage(typeOfClick +" is clicked");
	}
}
