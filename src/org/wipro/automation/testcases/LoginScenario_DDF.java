package org.wipro.automation.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.basepkg.InititiateBrowser;
import org.wipro.automation.datageneratorpkg.TestDataGenerator;
import org.wipro.automation.pages.LoginPage;
import org.wipro.automation.utilitypkg.ReadPropfile;

public class LoginScenario_DDF extends InititiateBrowser
{

	@Test(dataProvider="ddf",dataProviderClass=TestDataGenerator.class)
	public void tc01_loginfunctionality(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
	}
	
	
	
}
