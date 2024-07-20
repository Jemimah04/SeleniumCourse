package locatorspack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Locator: name     ------> AttributeName= 'AttributeValue'
		driver.findElement(By.name("field-keywords")).sendKeys("Nike");
		
		
		//Locator: id       ------> AttributeName= 'AttributeValue'
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Locator: id       ------> AttributeName= 'AttributeValue'
		//driver.findElement(By.className(""))
		
		
		//Locator: linkText (htmltag should start with a and end with a and the text should be visible.
		// If so, we can use it directly in "". the element should be unique
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
		
		//Locator: partialLinkText (htmltag should start with a and end with a and the text can be searched in partial.
		// If so, we can use it directly in "". the element should be unique
		
		driver.findElement(By.partialLinkText("Today's ")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Watched ")).click();
		Thread.sleep(1000);
		driver.navigate().back();
			
		
		//Locator: cssSelector syntax 1: [AttributeName='AttributeValue']
		driver.findElement(By.cssSelector("[aria-label=\"Clearance\"]")).click();
		
		//locator: cssSelector syntax 2: htmltag[AttributeName='AttributeValue']
		driver.findElement(By.cssSelector("input[aria-label='Search Amazon.in']")).sendKeys("Return gifts");
		
		//Locators:cssSelector syntax3: -----------> only for id ----> #AttributeValue
		driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
		
		
		driver.findElement(By.cssSelector("[tabindex=\"-1\"]")).click();
		
		
	}

}
