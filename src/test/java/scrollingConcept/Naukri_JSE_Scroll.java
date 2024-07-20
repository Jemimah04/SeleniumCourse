package scrollingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_JSE_Scroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//with JavascriptExecutor scroll approach:-
		//js.executeScript("window.scrollBy(0,1000);");
		
		//JavascriptExecutor scroll approach using webelement
		WebElement experienced = driver.findElement(By.xpath("//h2[contains(text(),'experienced')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true)",experienced);
	}

}
