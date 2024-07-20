package scrollingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingJSECodeArgument {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Add restaurant']")).click();
		Thread.sleep(2000);
		
		WebElement faq = driver.findElement(By.xpath("//div[text()='Frequently asked questions']"));
	
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", faq);
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(false);", faq);//boolean is false, coz the target element ie
																	// frequently asked question shd be seen at the bottom of 
		Thread.sleep(2000);											//the webpage. not to be seen in the top of the webpage after
		//scrolling. hence we give false. if we give true, the frequently asked question webelement will be seen at the top .
		
		
		
	}

}
