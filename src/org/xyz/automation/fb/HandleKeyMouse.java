package org.xyz.automation.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleKeyMouse 
{

	WebDriver driver;
	
	
	@Test
	public void handleframes() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  // chrome browser
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		CpatureScreenshot.screesnhostresult(driver,"handleframes");
		
		driver.quit();
	}
	@Test
	public void handleAlerts() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  // chrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		driver.switchTo().alert().accept();
		
		CpatureScreenshot.screesnhostresult(driver,"handleAlerts");
		
		
	}
	@Test(enabled=false)
	public void handleMouse() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  // chrome browser
		driver.get("https://www.mphasis.com/home.html");
		Actions act = new Actions(driver);
		
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		
	//	act.click(driver.findElement(By.xpath("//span[contains(text(),'Hi-Tech')]"))).perform();
	
	act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hi-Tech')]"))).keyUp(Keys.CONTROL).perform();
	
	Set<String> winsid = driver.getWindowHandles();
	System.out.println(winsid);
	
	Iterator<String> itr = winsid.iterator();
	
	String win1 = itr.next();
	String win2 = itr.next();
	
	driver.switchTo().window(win2);
	//driver.switchTo().window(win1);
	
	//driver.quit();
	
	}
	
	@Test(enabled=false)
	public void handleKeyboard() throws Exception
	{
		//WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  // chrome browser
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();
		
		//act.sendKeys("user1").perform();
		
		//Thread.sleep(5000);
		
		//act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("pass1233").perform();
		//act.sendKeys(Keys.ENTER).perform();
		
		
		
	}
	
		
}
