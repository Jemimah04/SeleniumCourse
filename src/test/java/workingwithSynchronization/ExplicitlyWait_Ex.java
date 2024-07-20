package workingwithSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/products_page/6");
		
	String productName = driver.findElement(By.xpath("//h4[text()='APPLE iPhone 14 Pro']")).getText();
	System.out.println("Product name is:"+productName);
	
	String productPrice = driver.findElement(By.xpath("//p[@class='CalculateOffer_wrapper__2XD4R']/span[1]")).getText();//parent following child 
	System.out.println(productPrice);
	
	driver.findElement(By.id("Check Delivery")).sendKeys("560064");
	
	//driver.findElement(By.cssSelector("[id='Check']")).click();//we get ElementClickInterceptedException
	//the work of implicitlyWait is to check where the webElement is present or not. here it is present so it just perform further action ie click but exception happens 
	//as this check webElement is present but is not highlighted until the pincode is added.only when the pincode is added, the check webElement gets highlighted
	//and can be clicked. so for this element alone, we use ExplicitlyWait
	
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[id='Check']"))));
	
	driver.findElement(By.id("Check")).click();
	
	String result=driver.findElement(By.id("Check Delivery-helper-text")).getText();
	
	System.out.println(result);
	
	
	
	
	
	}

}
