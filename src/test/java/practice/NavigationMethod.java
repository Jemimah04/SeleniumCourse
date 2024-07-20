package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethod {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver= new ChromeDriver();
		
		//driver.navigate().to("https://www.flipkart.com/");
		//navigate method is not recommended. as it doesnt wait for all the elements to be loaded
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		//Throwable can handle any exceptions
		
		driver.navigate().back();//move the webpage backward
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		driver.get("https://qspiders.com/");
		
		Thread.sleep(2000);
		
		driver.close();
			

	}

}
