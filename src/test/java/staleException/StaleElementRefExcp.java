package staleException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaleElementRefExcp {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(1000);
	
	driver.findElement(By.partialLinkText("Books")).click();
	
	if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/books"))
	{
		System.out.println("The webpage navigated to that web element");
	}
	else
		System.out.println("The webpage is not navigated to that web element");
	Thread.sleep(1000);
	
	WebElement productsDropDown = driver.findElement(By.id("products-orderby"));
	Select s= new Select(productsDropDown);
	//to get all options in the dropdown we need to write few lines . to avoid that we can use for loop 
	for(int i=0; i<=5; i++)
	{
		s.selectByIndex(i);
		System.out.println("index value is: " +i);   ///here we get StaleElementReferenceException bcoz , once A-Z is slectd, the webapge is refreshed and again we need to selec tht edropdown poisiton location
		Thread.sleep(1000);
		productsDropDown =driver.findElement(By.id("products-orderby")); //to avoid exception, we write line 37,38
		s=new Select(productsDropDown);
	}
	}
}
