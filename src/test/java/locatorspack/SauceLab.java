package locatorspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLab {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//locator: cssSelector syntax1:-  ----------> [AttributeName='AttributeValue']
		
		//driver.findElement(By.cssSelector("[id='user-name']")).sendKeys("standard_user");
		
		//locator: cssSelector syntax2:-  ----------> htmltag[AttributeName='AttributeValue']
		
		//driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("secret_sauce");
		
		
		//locator: className
		//driver.findElement(By.className("btn_action")).click();
		
		//locator: linkText
		//driver.findElement(By.linkText("Open Menu")).click();
		
		//Locators:cssSelector syntax3: -----------> only for id ----> #AttributeValue
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		
		//locator: cssSelector syntax1:-  ----------> [AttributeName='AttributeValue']
		driver.findElement(By.cssSelector("[placeholder=Password]")).sendKeys("secret_sauce");
		
		//Locators:cssSelector syntax5: -----------> only for class ----> .AttributeValue
		driver.findElement(By.cssSelector(".btn_action")).click();
		
		
	}

}
