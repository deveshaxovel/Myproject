package com.actitime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author Devesh
 *
 */

public class GetPropertiesValues {
	static String filepath="E:\\Weafricans\\src\test\\resources\\config.properties";
	/**
	 * @description
	 * @param key
	 * @return
	 */
	public static String getPropertyValues(String key){
		String data="";
		try{
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File(filepath)));
		data= prop.getProperty(key);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return data;
	}

}
