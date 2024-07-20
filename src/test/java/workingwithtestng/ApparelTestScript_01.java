package workingwithtestng;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import datadriventesting.Data_UtilityEx;
import workingwithpom.HomePage;
import workingwithpom.LoginPage;
import workingwithpom.SearchBar;

@Test
public class ApparelTestScript_01 {
	
	public void apparelTestScript_01() throws IOException {
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
		
		//validate homepage
		if(driver.getTitle().equals(LoginpageTitle))
		{
			System.out.println("Demo webshop login page displayed");
		}
		else
			System.out.println("login page not displayed");
		//to access methods of LoginPage class
		LoginPage login_page= new LoginPage(driver);
		login_page.getEmailTextField().sendKeys(dataUtil.getDataFromProperties("email"));
		login_page.getPasswordTextField().sendKeys(dataUtil.getDataFromProperties("password"));
		login_page.getLoginButton().click();
		//validate loginpage
		if(driver.getTitle().equals(LoginpageTitle))
		{
			System.out.println("Demo webshop login page displayed");
		}
		else
			System.out.println("login page not displayed");
		//searchbar
		SearchBar search= new SearchBar(driver);
		
		search.getSearchbar().sendKeys("blue jeans");
		search.getSubmit().click();
		System.out.println(driver.getTitle());
	}
	
	
}
	
	
	
	
	
	
	

