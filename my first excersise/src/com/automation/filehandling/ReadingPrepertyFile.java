package com.automation.filehandling;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ReadingPrepertyFile {

	public static void main(String[] args) throws Exception {
		
		String s =getAppProperty("url");
		System.out.println(s);
	}
	
	public static String getAppProperty(String propName) throws Exception  {
		
		//String filePath = "C:\\Users\\USER\\eclipse-workspace\\my first excersise\\ConfigData\\config.properties";
		String filePath2 = System.getProperty("user.dir")+File.separator+"ConfigData"+File.separator+"config.properties";
		System.out.println(filePath2);
		FileReader reader = new FileReader(filePath2);
		
		Properties prop = new Properties();
		prop.load(reader);
		
		String propvalue = prop.getProperty(propName);
		
		return propvalue;
	}

}
