package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartEx {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("Bluetooth");
		
		driver.findElement(By.cssSelector("svg[fill='none']")).click();
		driver.findElement(By.cssSelector("[alt='Mivi DuoPods i4 TWS,Quad-mic ENC,13mm Bass,50+ Hrs Playtime,low latency,Type C,5.3 Bluetooth Headset']")).click();
	}

}
