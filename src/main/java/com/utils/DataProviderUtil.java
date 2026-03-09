package com.utils;

import java.io.IOException;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.constants.FrameworkConstants;

public class DataProviderUtil {
	
	@DataProvider(name = "exceldata")
	public static Object[] readExcelWithDetails(Method m) throws IOException {
		String methodname = m.getName();
		List<Map<String,String>> excelList=ExcelUtil.readExcelData(FrameworkConstants.getDataProviderPath(), "Sheet1");
		
		List<Map<String,String>>finalList = new ArrayList<Map<String,String>>();
		
		for(int i=0;i<excelList.size();i++) {
			if(methodname.equalsIgnoreCase(excelList.get(i).get("testname")) && excelList.get(i).get("execute").equals("yes")) {
				
				finalList.add(excelList.get(i));
			}
		}
		
		return finalList.toArray();
			
	}

}
