package org.wipro.automation.utilitypkg;

import java.io.FileReader;
import java.util.Properties;

public class ReadPropfile 
{

	public static String readconfig(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
	public static String readelement(String key) throws Exception
	{
		FileReader fr = new FileReader("./TestData/element.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		return prop.get(key).toString();
		
	}
	
	
	
}
