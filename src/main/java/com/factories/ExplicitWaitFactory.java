package com.factories;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.enums.WaitStretegy;
import com.webDriver.DriverManager;

public class ExplicitWaitFactory {
	
	public static WebElement setWaitWithCondition(WaitStretegy strategy,By by) {
		
		WebElement ele = null;
		
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(30));
		
		if(strategy.equals(WaitStretegy.CLICKABLE)) {
			ele =wait.until(ExpectedConditions.elementToBeClickable(by));
             			
		}
		else if(strategy.equals(WaitStretegy.VISIBLE)){
			ele = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		}
		return ele;
		
	}

}
