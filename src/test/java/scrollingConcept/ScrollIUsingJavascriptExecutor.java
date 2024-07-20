package scrollingConcept;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIUsingJavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(1000);
//using javascript executor
		//first do typecasting
		JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,2000);");
	
//
	}

}
