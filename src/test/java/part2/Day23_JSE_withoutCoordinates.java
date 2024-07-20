package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day23_JSE_withoutCoordinates {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//to scroll down without coordinates;-
//	WebElement merchant = driver.findElement(By.xpath("//a[@href=\"https://www.amazonpay.in/merchant\"]"));

//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].scrollIntoView()",merchant);
//		
		//to scroll d=completeley downa nd then up
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		

	}

}
