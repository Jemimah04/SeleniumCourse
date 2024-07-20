package scrollingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zomato_scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Add restaurant']")).click();
		
		Thread.sleep(2000);
		Actions act= new Actions(driver);
		
		WebElement faq = driver.findElement(By.xpath("//div[@class='sc-hMqMXs jxrFIO']"));
		
		act.scrollToElement(faq).perform();
		
		Thread.sleep(2000);
		act.scrollToElement(faq).perform();
		//i have 2 times to scroll to reach tht faq webelement. this happens in few webpages. 
		//that time we can do 2 times scroll 
		
		
		
}

}
