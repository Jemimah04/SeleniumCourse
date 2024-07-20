package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonScenario {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//using name locator
		
		//driver.findElement(By.name("field-keywords")).sendKeys("Nike");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//driver.findElement(By.className("nav-a  ")).click();	--not working
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Today's D")).click();
//		driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Nike");
//		driver.findElement(By.cssSelector("[id='nav-search-submit-button']")).click();
		//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("return gifts");
		//driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bluetooth");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		String name = driver.findElement(By.xpath("//span[text()='pTron Bassbuds NX TWS Earbuds with HD Mic, TruTalk AI-ENC Calls, 32H Playtime, 13mm Drivers, Bluetooth 5.3 Wireless Headphones, Voice Assistant, Type-C Fast Charging & IPX5 Water Resistant (Brown)']")).getText();
		System.out.println(name);
	}

}
