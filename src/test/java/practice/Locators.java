package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//By is a class. all the methods in By are sttic methods  so to call static methds,, we use classname as ref
		
		//driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("btn_action")).click();
		
		
		
	}

}
