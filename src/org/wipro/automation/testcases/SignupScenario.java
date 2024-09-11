package org.wipro.automation.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.wipro.automation.basepkg.InititiateBrowser;
import org.wipro.automation.pages.SignupPage;

public class SignupScenario extends InititiateBrowser
{

	@Test
	public void tc010_signupfunctionality_validdata() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccount_bttn();
		sign.enter_firstname("Selenium");
		driver.findElement(By.name("lastname")).sendKeys("Java");
		sign.select_datofbirth_day("1");
		sign.click_gender_male_radiobttn();
		sign.click_submitbttn();
	}
	
}
