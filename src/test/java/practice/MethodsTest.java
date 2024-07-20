package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsTest {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String url = driver.getCurrentUrl();
		
		System.out.println("current url :" +url);
		
	String pageSource = driver.getPageSource();
		
		//System.out.println(pageSource);
		
		String Title = driver.getTitle();
		
		System.out.println("Title for the webpage: " +Title);
	
		 driver.manage().window().maximize();
		 Thread.sleep(1000);
		 		 
		 //driver.manage().window().fullscreen();
		 Thread.sleep(1000);
		
		// driver.manage().window().minimize();
		 Thread.sleep(1000);
		 
		 driver.navigate().back();
		 Thread.sleep(500);
		
		 driver.navigate().forward();
		 Thread.sleep(1000);
		 
		 driver.navigate().refresh();
		 Thread.sleep(500);
		 		 
		 driver.close();
		
		 	
		 //driver.quit();
		
		

	}

}
