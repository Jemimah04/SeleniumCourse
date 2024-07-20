package popupHandling;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingPopup_Ex2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.barbequenation.com/");
		Thread.sleep(3000);
		
		WebElement fbLink = driver.findElement(By.xpath("//span[@class='fa fa-facebook fa-lg']"));
		Actions act= new Actions(driver);
		act.scrollToElement(fbLink).perform();
		Thread.sleep(3000);
		List<WebElement> socialLink = driver.findElements(By.xpath("//ul[contains(@class, 'social')]/li/a/span")); //we need to get the common path for all the social links.
		// ie the parent path and from that go to the child link..
		
		
		for (WebElement allLinks : socialLink) {
		
			allLinks.click();
			Thread.sleep(3000);
		}
		
		Set<String> allIDs = driver.getWindowHandles();
		for (String id : allIDs) {
			driver.switchTo().window(id);
			Thread.sleep(5000);
			
			if(driver.getTitle().contains("Facebook"))
			{
				System.out.println("Title:" +driver.getTitle());
			}
			
			else 
				System.out.println("url:"+driver.getCurrentUrl());
			Thread.sleep(3000);
			driver.close();
					
		}
		

	}

}
