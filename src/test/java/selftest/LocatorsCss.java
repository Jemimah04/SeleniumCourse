package selftest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCss {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//locator: cssSelector syntax1  ---> [AttributeName='AttributeValue']
		driver.findElement(By.cssSelector("[name='user-name'")).sendKeys("standard_user");
				
		//locator: cssSelector syntax2  ----> htmltag[AttributeName='AttributeValue']
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
		
		//locator: cssSelector syntax3  ----> only for id  -------> #AttributeValue
		//driver.findElement(By.cssSelector("#login-button")).click();
		
		//locator: cssSelector syntax4   ----> only for id  ------> htmltag#AttributeValue
		//driver.findElement(By.cssSelector("input#login-button")).click();		
		
		//locator: cssSelector syntax5   -----> only for class ----> .AttributeValue
		//driver.findElement(By.cssSelector(".btn_action")).click();
		
		//locator: cssSelector syntax6  ------> only for class -----> htmltag.AttributeValue
			driver.findElement(By.cssSelector("input.btn_action")).click();	
			
		
		
		
		

	}

}
