package assertion_pack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import datadriventesting.DataUtility;
import workingwithpom.BooksPage;
import workingwithpom.HomePage;
import workingwithpom.LoginPage;

public class TestCase01_Assert {
	
	@Test
	public void testCase01_Assert() throws IOException
	{
		DataUtility dataUtil= new DataUtility();
		String value1=dataUtil.getDataFromExcel("TestData", 1, 0);
		String HomepageTitle=dataUtil.getDataFromExcel("TestData", 1, 1);
		String LoginpageTitle= dataUtil.getDataFromExcel("TestData", 2, 1);
		String BooksPageTitle = dataUtil.getDataFromExcel("TestData", 5, 1);
		
		//to launch browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to open webpage
		driver.get(dataUtil.getDataFromProperties("url"));
		
		//to access methods of HomePage class
		HomePage home_page= new HomePage(driver);
		home_page.getLoginpageLink().click();
		
		//to use assert
		Assert.assertEquals(driver.getTitle(), LoginpageTitle);
		//System.out.println("Login Page displayed");
		Reporter.log(LoginpageTitle);
		
		//to access methods of LoginPage class
				LoginPage login_page= new LoginPage(driver);
				login_page.getEmailTextField().sendKeys(dataUtil.getDataFromProperties("email"));
				login_page.getPasswordTextField().sendKeys(dataUtil.getDataFromProperties("password"));
				login_page.getLoginButton().click();
				//validate loginpage
				Assert.assertEquals(driver.getTitle(), HomepageTitle);
				//System.out.println("Home page displayed");
		Reporter.log(HomepageTitle);
				//to access methods of booksPage class
				BooksPage bp= new BooksPage(driver);
				bp.getBooks().click();
				
				//to validate books page
				Assert.assertEquals( driver.getTitle(), BooksPageTitle);
				//System.out.println("Books page is displayed");
		Reporter.log(BooksPageTitle);
				//to access methods of LogoutPage class
				home_page.getLogout().click();
				
				//to validate logout
				Assert.assertEquals(driver.getTitle(), HomepageTitle);
				System.out.println("Logout - Testcase 01 pass");

	}
	
	
	
	
	
	

}
