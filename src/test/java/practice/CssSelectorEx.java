package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//syntax 1 for cssSelector:
		
		driver.findElement(By.cssSelector("[data-csa-c-content-id='nav_cs_electronics']")).click();
		
		
		

	}

}
