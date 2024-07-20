package scrollingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_JSE_Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Add restaurant']")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		WebElement faq = driver.findElement(By.xpath("//div[text()='Frequently asked questions']"));
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].scrollIntoView(true);", faq);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false);", faq);
		System.out.println(faq.getText());
		
	}

}
