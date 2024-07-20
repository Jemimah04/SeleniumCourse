package scrollingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(1000);
		
		//first locate the web element
WebElement catering = driver.findElement(By.xpath("//label[text()='E-CATERING']"));		
		Actions act = new Actions(driver);
		act.scrollToElement(catering).perform();
		Thread.sleep(3000);
		//driver.close();
		
	}

}
