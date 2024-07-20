package workingwithtestng;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import datadriventesting.Data_UtilityEx;
import workingwithpom.BooksPage;
import workingwithpom.FictionEx;
import workingwithpom.HomePage;
import workingwithpom.LoginPage;

public class BooksTestScript_02 {
	
	@Test
	public void booksTestScript() throws IOException {
		Data_UtilityEx data_UEx= new Data_UtilityEx();
		
		//to access Sheet1 of Excel
		//String value2=data_UEx.getDataFromExcel("Sheet1", 1, 1);
		String HomePageTitle=data_UEx.getDataFromExcel("TestData", 1, 1);
		String LoginPageTitle= data_UEx.getDataFromExcel("TestData", 2, 1);
		String BooksPageTitle=data_UEx.getDataFromExcel("TestData", 5, 1);
		
		//S1: launch browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//S2:- open webpage using properties
		driver.get(data_UEx.getDataFromProperties("url"));
				
		//S3: access HomePage to get getter methods
		HomePage home_page=new HomePage(driver);
		home_page.getLoginpageLink().click();
		System.out.println(driver.getTitle());		
		//S4: validate homepage
		if(driver.getTitle().equals("Demo Web Shop. Login"))
		{
			System.out.println("Login page displayed");
		}
		else
			System.out.println("Login page not displayed");
		
		//to access login page and enter email , pw and click on login button
		LoginPage login_page= new LoginPage(driver);
		
		login_page.getEmailTextField().sendKeys(data_UEx.getDataFromProperties("email"));
		login_page.getPasswordTextField().sendKeys(data_UEx.getDataFromProperties("password"));
		login_page.getLoginButton().click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Demo Web Shop"))
		{
			System.out.println("Home page displayed");
		}
		else
			System.out.println("Home page not displayed");
		
		//navigate to books page
		BooksPage book_page= new BooksPage(driver);
		book_page.getBooks().click();
		if(driver.getTitle().equals("Demo Web Shop. Books"))
		{
			System.out.println("Books page displayed");
		}
		else
			System.out.println("Books page not displayed");
		
		//select FictionEx
		FictionEx ficEx= new FictionEx(driver);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false);", ficEx);
		ficEx.getFictionEx().click();
		
		
		if(driver.getTitle().equals("Demo Web Shop. Fiction EX"))
		{
			System.out.println("FictionEx page displayed");
		}
		else
			System.out.println("FictionEx page not displayed");
	}
	
	
	

}
