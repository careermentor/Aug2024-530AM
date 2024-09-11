package org.wipro.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.automation.utilitypkg.ReadPropfile;

public class SignupPage
{

	WebDriver driver;
	
	
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void click_createnewaccount_bttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropfile.readelement("login_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropfile.readelement("signup_firstname_name"))).sendKeys(fname);
	}
	
	public void select_datofbirth_day(String dob_day) throws Exception
	{
		Select dob_day_obj = new Select(driver.findElement(By.name(ReadPropfile.readelement("signup_birthday_day_name"))));
		
		dob_day_obj.selectByVisibleText(dob_day);
	}
	
	public void click_gender_male_radiobttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropfile.readelement("signup_gender_male_xpath"))).click();
	}
	
	public void click_submitbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropfile.readelement("signup_signupbttn_name"))).click();
	}
	
	
}
