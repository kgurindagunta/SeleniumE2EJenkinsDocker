package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.constants.FrameworkConstants;
import com.enums.FrameworkData;

public class PropertyFileUtil {
	
	private static Properties prop;
	private static Map<String,String>CONFIGMAP;
	
	static {
		
		try {
			FileInputStream fis = new FileInputStream(FrameworkConstants.getPropertyFilePath());
			try {
				prop =new Properties();
				prop.load(fis);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getPropertyFileValue(FrameworkData data) {
		
		CONFIGMAP = new HashMap<String, String>();
		
		
		for(Map.Entry<Object, Object> map:  prop.entrySet()) {
			
			CONFIGMAP.put(String.valueOf(map.getKey()), String.valueOf(map.getValue()));
		}
		return CONFIGMAP.get(data.toString().toLowerCase());
		
	}

}
