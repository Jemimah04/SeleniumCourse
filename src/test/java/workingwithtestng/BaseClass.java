package workingwithtestng;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import datadriventesting.DataUtility;
import workingwithpom.HomePage;
import workingwithpom.LoginPage;
import workingwithpom.Logout;

public class BaseClass {

	DataUtility data_Utility= new DataUtility();
	public WebDriver driver;//to use driver obj globally
	HomePage home_Page;
	
	
	//create @BeforeClass, @BeforeMethod @AfterClass, @AfterMethod
	
	@BeforeClass
	public void launchBrowser() throws IOException {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(data_Utility.getDataFromProperties("url"));//to get data from proerties file, create obj for properties file class globally
		home_Page= new HomePage(driver);
	}
	
	@BeforeMethod
	public void performLogin() throws IOException {
	//to use driver variable in all methods, declare driver obj globally
		home_Page.getLoginpageLink().click(); //usign home page obj click on  loginpage element
		//write code for login (ie email, pw, login button)
		
		LoginPage login_page= new LoginPage(driver);
		login_page.getEmailTextField().sendKeys(data_Utility.getDataFromProperties("email"));
		login_page.getPasswordTextField().sendKeys(data_Utility.getDataFromProperties("password"));
		login_page.getLoginButton().click();
		
	}
	@AfterMethod
	public void performLogout()
	{
		home_Page.getLogout().click();
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
	driver.quit();	
	}
	
	
	
}
