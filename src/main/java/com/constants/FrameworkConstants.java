package com.constants;


public class FrameworkConstants {
	
	private static String config_properties = System.getProperty("user.dir")+"/src/main/resources/config.properties";
	private static String methodInterceptor = System.getProperty("user.dir")+"/src/main/resources/MethodInterceptortest.xls";
	private static String dataProvider = System.getProperty("user.dir")+"/src/main/resources/DataProviderE2E.xls";

	
	public static String getPropertyFilePath() {
		return config_properties; 
	}
	
	public static String getMethodInterceptor() {
		return methodInterceptor; 
	}
	
	public static String getDataProviderPath() {
		return dataProvider; 
	}

}
