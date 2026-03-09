package com.listeners;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import com.constants.FrameworkConstants;
import com.utils.ExcelUtil;

public class MethodInterceptor implements IMethodInterceptor{

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		
		List<IMethodInstance>finalList = new ArrayList<IMethodInstance>();
		
		List<Map<String,String>> excelList = null;
		
		try {
			 excelList = ExcelUtil.readExcelData(FrameworkConstants.getMethodInterceptor(), "Sheet1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*		for(int i=0;i<methods.size();i++) {
			if(methods.get(i).getMethod().getMethodName().equalsIgnoreCase("loginTest")|| methods.get(i).getMethod().getMethodName().equalsIgnoreCase("loginLogoutTest")){
				methods.get(i).getMethod().setInvocationCount(2);
				finalList.add(methods.get(i));
			}
		}*/
		
		for(int i=0;i<methods.size();i++) {
			
			for(int j=0;j<excelList.size();j++) {
				
				if(methods.get(i).getMethod().getMethodName().equalsIgnoreCase(excelList.get(j).get("testname")) && excelList.get(j).get("execute").equalsIgnoreCase("yes")){
					methods.get(i).getMethod().setDescription(excelList.get(j).get("testdescription"));
					methods.get(i).getMethod().setInvocationCount(Integer.parseInt(excelList.get(j).get("count").split("\\.")[0]));	
					finalList.add(methods.get(i));
				}
				
			}
		}
		return finalList;
	}
	
	

}
