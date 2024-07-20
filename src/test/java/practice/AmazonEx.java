package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phone");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//driver.findElements(By.xpath(""))

	}

}
