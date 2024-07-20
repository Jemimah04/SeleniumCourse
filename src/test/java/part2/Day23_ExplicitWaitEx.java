package part2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day23_ExplicitWaitEx {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//explicitly wait
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");
		//explicit wait syntax:-
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	
		wait.until(ExpectedConditions.elementToBeClickable(username));
		username.click();
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		
		//explicit wait to check title is matching
		//wait.until(ExpectedConditions.titleContains("Helo"));  //since title is not matching , explicit wait will wait for 10 secs and throw tiemoutexception
		
		wait.until(ExpectedConditions.titleContains("Swag Labs"));  //since title of the webpage is matching, next line ie the product is opened in next page
		driver.findElement(By.xpath("//img[@src='./img/sauce-backpack-1200x1500.jpg']")).click();
		

	}

}
