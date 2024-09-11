package org.wipro.automation.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.basepkg.InititiateBrowser;
import org.wipro.automation.pages.LoginPage;
import org.wipro.automation.utilitypkg.ReadPropfile;

public class LoginScenario extends InititiateBrowser
{

	@Test
	public void tc01_loginfunctionality_validcredential() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		login.enter_username(ReadPropfile.readconfig("username"));
		login.enter_password("pass123");
		login.click_loginbttn();
	}
	
}
