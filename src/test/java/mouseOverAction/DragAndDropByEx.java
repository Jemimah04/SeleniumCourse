package mouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("iphone", Keys.ENTER);
		Thread.sleep(3000);
		
		//to drag the price range from 0 to 500 eg:
		WebElement pricePoint1 = driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']/div"));
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(pricePoint1, 50, 0).perform(); //since we need to drag only horizontally we enter value for x axes only. 50 is given randomly
		
		//if we need to move vertically we can use value for y.
	}

}
