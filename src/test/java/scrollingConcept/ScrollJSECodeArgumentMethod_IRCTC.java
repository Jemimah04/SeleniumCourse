package scrollingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollJSECodeArgumentMethod_IRCTC {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(2000);
		
	WebElement tourPackage = driver.findElement(By.xpath("//h3[text()='Rail Tour Packages']"));
		
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)", tourPackage);
	Thread.sleep(1000);
	
	
	

	}

}
