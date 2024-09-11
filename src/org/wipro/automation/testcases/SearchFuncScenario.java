package org.wipro.automation.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.basepkg.InititiateBrowser;
import org.wipro.automation.datageneratorpkg.TestDataGenerator;
import org.wipro.automation.pages.SearchPage;

public class SearchFuncScenario extends InititiateBrowser
{

	@Test(dataProvider="ddf1",dataProviderClass=TestDataGenerator.class)
	public void tc01_searchfunctionality(String search1) throws Exception
	{
		SearchPage search = new SearchPage(driver);
		search.enter_searchtext(search1);
		search.click_searchbttn();
		
	}
	
}
