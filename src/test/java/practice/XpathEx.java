package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathEx {

	public static void main(String[] args) {
			
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
	
		
		//Absolute xpath:
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div[1]/form/input[1]")).sendKeys("standard_user");
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div[1]/form/input[2]")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[1]/div[1]/form/input[3]")).click();
		
		
	}

}
