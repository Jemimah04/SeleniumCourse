package part2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarbyJavaScriptExecutor {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//downcasting javascriptexecutor:-
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
		for(int i=0; i<5; i++)
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		
		for(int i=0; i<3; i++) //to scroll down how many times,up and down
		{
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
					
		}
		
		
	}

}
