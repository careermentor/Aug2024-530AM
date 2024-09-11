package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentControl 
{

	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();  // chrome browser
		
		driver.navigate().to("https://thetestingworld.com/testings/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement a = driver.findElement(By.name("fld_username"));
		a.sendKeys("Testing");
		
		driver.findElement(By.id("datepicker")).sendKeys("08/08/1980");
		driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='8']")).click();
	
		
		driver.findElement(By.cssSelector("[value='home']")).click();
		
		boolean acttermsckbox = driver.findElement(By.name("terms")).isSelected();
		System.out.println(acttermsckbox);
		
		Assert.assertEquals(acttermsckbox, false);
		
		
		driver.findElement(By.name("terms")).click();
		
		boolean afteracttermsckbox = driver.findElement(By.name("terms")).isSelected();
		System.out.println(afteracttermsckbox);
		
		Assert.assertEquals(afteracttermsckbox, true);
		
		
		driver.findElement(By.className("displayPopup")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("close")).click();
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		gen.selectByIndex(1);
		//gen.selectByValue("2");
		//gen.selectByVisibleText("Male");
		
		//gen.deselectAll();
		//gen.deselectByValue("2");
		//gen.deselectByVisibleText("Male");
		//gen.selectByVisibleText("Female");
		
		System.out.println(driver.findElement(By.cssSelector("input[value='Sign up']")).isEnabled());
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		Select st = new Select(driver.findElement(By.name("state")));
		
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	//	wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Florida"));
		
		st.selectByVisibleText("Arizona");
		
	}
	
		
}
