package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.constants.FrameworkConstants;

public class ExcelUtil {
	
	public static List<Map<String, String>> readExcelData(String file, String sheetname) throws IOException {
		FileInputStream fis = new FileInputStream(new File(file));
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(sheetname);
		
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
		
		List<Map<String,String>> list = new ArrayList<Map<String,String>>();
		
		Map<String,String>map;
		
		for(int i=1;i<=rows;i++) {
			
			map = new HashMap<String, String>();
			for(int j=0;j<columns;j++) {
				
				String key = sheet.getRow(0).getCell(j).toString();
				String value = sheet.getRow(i).getCell(j).toString();
				map.put(key, value);			
			}
			list.add(map);
		}
		return list;
	}
	
	/*public static void main(String args[]) throws IOException {
		
		System.out.println(readExcelData());
		
	}*/

}
