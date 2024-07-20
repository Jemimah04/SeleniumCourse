package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/AllExamples.html ");
		
		//S1: locate the dropdown webelement
		WebElement dropDwon = driver.findElement(By.xpath("//select[@title='SelectYourHero']"));
		//S2: Create object for the Select class
		Select s= new Select(dropDwon);
		//S3: select the option from the dropdown
		s.selectByIndex(5);
		Thread.sleep(2000);
	
		s.selectByValue("aamir");
		Thread.sleep(2000);
		
		s.selectByVisibleText(" Salman Khan");
		
	}

}
