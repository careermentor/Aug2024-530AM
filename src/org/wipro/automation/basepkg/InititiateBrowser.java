package org.wipro.automation.basepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.utilitypkg.ReadPropfile;

public class InititiateBrowser
{

	public WebDriver driver;
	
	@BeforeMethod
	public void launchbroweser() throws Exception
	{
		if(ReadPropfile.readconfig("BrowserName").equalsIgnoreCase("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(ReadPropfile.readconfig("BrowserName").equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
			
		}
		
		else if(ReadPropfile.readconfig("BrowserName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		driver.get(ReadPropfile.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
}
