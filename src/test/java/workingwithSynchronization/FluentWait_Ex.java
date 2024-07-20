package workingwithSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/products_page/6");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String productName = driver.findElement(By.xpath("//h4[text()='APPLE iPhone 14 Pro']")).getText();
		System.out.println("Product name is:"+productName);
		
		String productPrice = driver.findElement(By.xpath("//p[@class='CalculateOffer_wrapper__2XD4R']/span[1]")).getText();//parent following child 
		System.out.println(productPrice);
		
		driver.findElement(By.id("Check Delivery")).sendKeys("560064");
		//use fluent wait
		FluentWait wait= new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);  //here we select NoSuchElementException from selenium package
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Check"))));
		
		driver.findElement(By.id("Check")).click();
		String deliveryReport = driver.findElement(By.id("Check Delivery-helper-text")).getText();
		System.out.println(deliveryReport);
		
		
		
			
	}

}
