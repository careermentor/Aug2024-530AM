package org.wipro.automation.datageneratorpkg;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="ddf")
	public Object[][] testdata()
	{
		//String data1 = "user1";
		//Object[] data2 = {"user1","pass1"};  //1-D array
		Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //1-D array
		return data3;
	}
	

	@DataProvider(name="ddf1")
	public Object[] testdata1()
	{
		//String data1 = "user1";
		Object[] data2 = {"iphone15","iphone16"};  //1-D array
		//Object[][] data3 = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};  //1-D array
		return data2;
	}
}
