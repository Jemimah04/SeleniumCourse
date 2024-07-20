package selftest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPhonePrice {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search for Products')]")).sendKeys("phones");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//for phone names in the webpage to print
		List<WebElement> phoneNames = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		//for all the phone price in the webpage to print
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));

		for(int i=0; i<price.size(); i++)
		{
			System.out.println(phoneNames.get(i).getText()+"------"+price.get(i).getText());
		}
		
		//gettext-- from app to script we use gettext()
		
//		
//		for(WebElement phName : phoneNames) {
//			System.out.println(phName.getText());
//		}
//			
//	for(WebElement amount: price) {
//		System.out.println(amount.getText());
//	}
//	
	}

}
