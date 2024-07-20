package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day20_MouseOverActiosn {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
//		
	WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
Actions act = new Actions(driver);
//		//method1: to move the cursor on the particular element
		act.moveToElement(ele).perform();
//		//method2: contextClick() -- to right click on element
//		act.contextClick(ele).perform();
		//can write aboce contextClick in one line
		act.moveToElement(ele).contextClick(ele).build().perform();
		
//		driver.get("https://www.saucedemo.com/v1/");
//		WebElement Username = driver.findElement(By.name("user-name"));
//		WebElement Password = driver.findElement(By.name("password"));
//		WebElement Login = driver.findElement(By.id("login-button"));
//	
//		//method3: sendKeys(WebElement target, "data")--->to send data to the app
//		Actions act = new Actions(driver);
////		act.sendKeys(Username, "standard_user").perform();
////		act.sendKeys(Password, "secret_sauce").perform();
////		//method4:click(WebElement target)---->to click the element or button
////		act.click(Login).perform();
//		
//		//instead of line 32,33,35 we can do it one line
//		act.sendKeys(Username, "standard_user").sendKeys(Password, "secret_sauce").click(Login).build().perform();
		
		
	}

}
