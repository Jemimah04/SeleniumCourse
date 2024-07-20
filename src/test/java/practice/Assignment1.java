package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
	
	//scenario 1:
		
		driver.findElement(By.className("Pke_EE")).click();
		
	//scenario 2:
		//unable to select the grocery or mobiles tab as there is no unique locator 
		
		
		
		

	}

}
