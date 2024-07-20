package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttributes {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Xpath by Multiple Attributes: AND operator true table
		//syntax 1: //htmltag[@AttributeName='AttributeValue' and @AttributeName='AttributeValue']

driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in' and @class='nav-input nav-progressive-attribute']")).sendKeys("toys");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='submit']")).click();
		
		//Xpath by Multiple Attributes: OR operator true table
				//syntax 2: //htmltag[@AttributeName='AttributeValue' or @AttributeName='AttributeValue']
		//driver.findElement(By.xpath("//a[@class='nav-a  ' or @data-csa-c-slot-id='nav_cs_5']")).click(); //here i got 1 out of 32,
		// ie 1 is true but still uniqueness is not available. so we cant use.
		
		//syntax3: //htmltag[text()='Attributevlaue' or @AttributeName='AttributeValue']
	
		
		
		driver.findElement(By.xpath("//a[text()='Mobiles' or @data-csa-c-content-id='nav_cs_mobiles']")).click();
		
		//try syntax 4,5,6
		
		
	}

}
