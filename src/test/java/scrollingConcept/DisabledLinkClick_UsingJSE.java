package scrollingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledLinkClick_UsingJSE {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/java/technologies/downloads/ ");
		Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='jdk-8u411-linux-aarch64.rpm']"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)",link );
		
		link.click();
//		
		WebElement disabledLink = driver.findElement(By.xpath("//a[text()='Download jdk-8u411-linux-aarch64.rpm']"));
		
		js.executeScript("arguments[0].click();",disabledLink );
		
		
	}

}
