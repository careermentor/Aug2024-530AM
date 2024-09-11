package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataRuntime 
{

	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  // chrome browser
		
		//step1
		String expURL = "https://www.facebook.com/";
		driver.get(expURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		Assert.assertEquals(ActURL, expURL);  //hard assertion
		
		//SoftAssert sa = new SoftAssert();
		//sa.assertEquals(ActURL, expURL);  //soft assertion
		
		System.out.println("Step1 pass");
		
		//Step2
		String ExpPageTitle = "Facebook – log in or sign up";
		String ActPageTitle = driver.getTitle();
		System.out.println(ActPageTitle);
		
		//sa.assertEquals(ActPageTitle, ExpPageTitle);
		Assert.assertEquals(ActPageTitle, ExpPageTitle);
		System.out.println("Step2 pass");
		
		//sa.assertAll();
		
		//Step3
		String Exp_username = "Email address or phone number";
		
		String Act_username = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(Act_username);
		Assert.assertEquals(Act_username, Exp_username);
		
		//step4
		
		String Exp_LoginBttn = "Log in";
		String Act_loginBttn = driver.findElement(By.name("login")).getText();
		System.out.println(Act_loginBttn);
		
		Assert.assertEquals(Act_loginBttn, Exp_LoginBttn);
		
		Point loginloc = driver.findElement(By.name("login")).getLocation();
		
		System.out.println(loginloc);
		System.out.println(driver.getPageSource());
	}
	
	
	
		
}
