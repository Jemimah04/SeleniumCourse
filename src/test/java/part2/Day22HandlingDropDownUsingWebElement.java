package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day22HandlingDropDownUsingWebElement {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//to click on create an account
				driver.findElement(By.xpath("//a[text()='Create new account']")).click();
				Thread.sleep(1000);
				//using webelement
				WebElement date = driver.findElement(By.xpath("//option[text()='13']"));
		date.click();
		
		WebElement month = driver.findElement(By.xpath("//option[text()='Jan']"));
		month.click();
		
		WebElement year = driver.findElement(By.xpath("//option[text()='2013']"));
		year.click();
		
	}

}
