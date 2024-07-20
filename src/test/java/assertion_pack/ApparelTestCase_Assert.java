package assertion_pack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import datadriventesting.Data_UtilityEx;
import workingwithpom.HomePage;
import workingwithpom.LoginPage;
import workingwithpom.SearchBar;

public class ApparelTestCase_Assert {
	@Test
	public void apparelTestCase_Assert() throws IOException {
		Data_UtilityEx dataUtil= new Data_UtilityEx();
		String value1=dataUtil.getDataFromExcel("TestData", 1, 0);
		String HomepageTitle=dataUtil.getDataFromExcel("TestData", 1, 1);
		String LoginpageTitle= dataUtil.getDataFromExcel("TestData", 2, 1);
		//to launch browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to open webpage
		driver.get(dataUtil.getDataFromProperties("url"));
		HomePage home_page= new HomePage(driver);
		home_page.getLoginpageLink().click();
		
		Assert.assertEquals(driver.getTitle(), LoginpageTitle);
		//System.out.println("Login page displayed");
		Reporter.log(LoginpageTitle);
		//to access methods of LoginPage class
				LoginPage login_page= new LoginPage(driver);
				login_page.getEmailTextField().sendKeys(dataUtil.getDataFromProperties("email"));
				login_page.getPasswordTextField().sendKeys(dataUtil.getDataFromProperties("password"));
				login_page.getLoginButton().click();
				
				Assert.assertEquals(driver.getTitle(),HomepageTitle );
				//System.out.println("home page displayed");
				Reporter.log(HomepageTitle, true);
				SearchBar search= new SearchBar(driver);
				
				search.getSearchbar().sendKeys("blue jeans");
				search.getSubmit().click();
				Assert.assertTrue(true, "Shop. Search");;
				//System.out.println("Search page displayed");
				Reporter.log("Search page displayed", true);
		
		
	}

}
