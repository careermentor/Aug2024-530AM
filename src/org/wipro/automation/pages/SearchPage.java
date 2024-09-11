package org.wipro.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.utilitypkg.ReadPropfile;

public class SearchPage
{

	WebDriver driver;
	
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void enter_searchtext(String sname) throws Exception
	{
		driver.findElement(By.id(ReadPropfile.readelement("amazon_home_searchtextbox_id"))).sendKeys(sname);
	}
	
	
	
	public void click_searchbttn() throws Exception
	{
		driver.findElement(By.cssSelector(ReadPropfile.readelement("amazon_home_searchbttn_css"))).click();
	}
	
	
}
