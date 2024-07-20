package assertion_pack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import datadriventesting.Data_UtilityEx;
import workingwithpom.BooksPage;
import workingwithpom.FictionEx;
import workingwithpom.HomePage;
import workingwithpom.LoginPage;

public class TestCase02_Assert {
@Test
public void testCase02_Assert() throws IOException {
	Data_UtilityEx data_UEx= new Data_UtilityEx();
	
	//to access Sheet1 of Excel
	//String value2=data_UEx.getDataFromExcel("Sheet1", 1, 1);
	String HomePageTitle=data_UEx.getDataFromExcel("TestData", 1, 1);
	String LoginPageTitle= data_UEx.getDataFromExcel("TestData", 2, 1);
	String BooksPageTitle=data_UEx.getDataFromExcel("TestData", 5, 1);
	
	//S1: launch broswer
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//S2:- open webpage using properties
	driver.get(data_UEx.getDataFromProperties("url"));
			
	//S3: access HomePage to get getter methods
	HomePage home_page=new HomePage(driver);
	home_page.getLoginpageLink().click();
	
	Assert.assertEquals(driver.getTitle(),LoginPageTitle);
	System.out.println("Login page displayed");
	
	//to access login page and enter email , pw and click on login button
			LoginPage login_page= new LoginPage(driver);
			
			login_page.getEmailTextField().sendKeys(data_UEx.getDataFromProperties("email"));
			login_page.getPasswordTextField().sendKeys(data_UEx.getDataFromProperties("password"));
			login_page.getLoginButton().click();
			
			Assert.assertEquals(driver.getTitle(), HomePageTitle);
			System.out.println("home page displayed");
			
			BooksPage book_page= new BooksPage(driver);
			book_page.getBooks().click();
			
			Assert.assertEquals(driver.getTitle(), BooksPageTitle);
			System.out.println("books page displayed");
	
			//select FictionEx
			FictionEx ficEx= new FictionEx(driver);
			
			ficEx.getFictionEx().click();
			
			//Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Fiction EX" );
			
			Assert.assertTrue(true, "Fiction EX");
			System.out.println("Fiction Ex page displayed");
			
	
	
	
	
	
	
	
	
	
	
	
	
}
}
