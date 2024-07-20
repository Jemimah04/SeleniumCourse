package demowebshoptestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import workingwithpom.SearchBar;
import workingwithtestng.BaseClass;
@Test
public class ApparelTestCase_TestNG extends BaseClass
{
	
	
	public void apparelTestCase_TestNG()
	{
		
		SearchBar search= new SearchBar(driver);
		search.getSearchbar().sendKeys("blue jeans");
		search.getSubmit().click();
		
	}

}
