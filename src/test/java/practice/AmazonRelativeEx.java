package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonRelativeEx {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bluetooth");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String name = driver.findElement(By.xpath("//span[text()='pTron Bassbuds NX TWS Earbuds with HD Mic, TruTalk AI-ENC Calls, 32H Playtime, 13mm Drivers, Bluetooth 5.3 Wireless Headphones, Voice Assistant, Type-C Fast Charging & IPX5 Water Resistant (Brown)']")).getText();
		System.out.println(name);
	}

}
