package com.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {

	
	int count =0,MAX_COUNT=1;
	@Override
	public  boolean retry(ITestResult result) {
		
		if(count<MAX_COUNT){
			count++;
			return true;
			
		}
		return false;
	}
	
	

}
