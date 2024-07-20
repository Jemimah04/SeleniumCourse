package demowebshoptestcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import datadriventesting.DataUtility;


public class ApparelTestCase01_UsingProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//to use the generic method of properties file, import that class 
		DataUtility data_utility= new DataUtility();
		
		
		//S1: to launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//to get url from properties file
		driver.get(data_utility.getDataFromProperties("url"));
		
		//s2: validate
		if(driver.getTitle().equals("Demo Web Shop"))
		{
			System.out.println("Demowebshop page is dsipalyed");
		}
		else
			System.out.println("Demowebshop page is not displayed");
		

	}

}
