package part2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day23_scrollleftotoright {

	
		public static void main(String[] args) throws Throwable {
			WebDriver driver= new ChromeDriver();
			//driver.get("https://www.facebook.com/");
			driver.get("https://demo.automationtesting.in/Windows.html");
			driver.manage().window().maximize();
			
			
	JavascriptExecutor jse = (JavascriptExecutor)driver;
//			jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
//			Thread.sleep(1000);
//			
			
			
			
			//to scroll left to right ie. y axis
		
			jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
			Thread.sleep(1000);
			
			////to scroll  right to left  ie. y axis
			jse.executeScript("window.scrollTo(-document.body.scrollHeight,0)");
			Thread.sleep(1000);
			
			
	}

}
