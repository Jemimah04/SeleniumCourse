package workingwithpom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import datadriventesting.DataUtility;

public class TestScript_Login {

	public static void main(String[] args) throws IOException {
		
		
		DataUtility dataUtil= new DataUtility();
		//to get datas from excel
		String value=dataUtil.getDataFromExcel("TestData", 1, 0);
		String HomePageTitle= dataUtil.getDataFromExcel("TestData", 1, 1);
		String LoginpageTitle= dataUtil.getDataFromExcel("TestData", 2, 1);
		String ComputersPageTitle= dataUtil.getDataFromExcel("TestData", 3, 1);
		String ShoppingCartTitle= dataUtil.getDataFromExcel("TestData", 4, 1);
		
		

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(dataUtil.getDataFromProperties("url"));
		
		//create obj for homepage pom class to access getter method
		HomePage home_page= new HomePage(driver);
		//getter method in homepage
		home_page.getLoginpageLink().click();
		
		//validate whether the login page is opened
		if(driver.getTitle().equals(LoginpageTitle))
		{
			System.out.println("Demo webshop login page displayed");
		}
		else
			System.out.println("login page not displayed");
		
		//create obj for loginPage pom class to perform login
		LoginPage login_page= new LoginPage(driver);
		login_page.getEmailTextField().sendKeys(dataUtil.getDataFromProperties("email"));
		login_page.getPasswordTextField().sendKeys(dataUtil.getDataFromProperties("password"));
		login_page.getLoginButton().click();
		
		//validate the login page
		if(driver.getTitle().equals(HomePageTitle))
		{
			System.out.println("Demo webshop home page displayed");
		}
		else
			System.out.println("home page not displayed");
		
		driver.close();
		
		
	}

}
