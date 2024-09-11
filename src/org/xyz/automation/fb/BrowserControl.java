package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserControl 
{

	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  // chrome browser
		
		driver.navigate().to("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		//driver.close();  ///close the current window/tab only 
		driver.quit(); //close all window/tab
		
	}
	
		
}
