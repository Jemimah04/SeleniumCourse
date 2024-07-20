package workingwithtestng;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import datadriventesting.DataUtility;
import workingwithpom.BooksPage;
import workingwithpom.HomePage;
import workingwithpom.LoginPage;
import workingwithpom.Logout;

@Test
public class BooksTestScript_01 {

	public void booksTestScript01() throws IOException{
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
		if(driver.getTitle().equals(HomepageTitle))
		{
			System.out.println("Demo webshop home page displayed");
		}
		else
			System.out.println("home page not displayed");
		
			//to access methods of booksPage class
		BooksPage bp= new BooksPage(driver);
		bp.getBooks().click();
		
		//to validate books page
		if(driver.getTitle().equals(BooksPageTitle))
		{
			System.out.println("Books page is displayed");
		}
		else
			System.out.println("Books page not displayed");
		
		//to access methods of LogoutPage class
		Logout log= new Logout(driver);
		log.getLogout().click();
		
		//to validate logout
		if(driver.getTitle().equals(HomepageTitle))
		{
			System.out.println("Test case pass----");
		}
		
		else
			System.out.println("Test case fail----");
		
		
	}
	
	
	
	
}
