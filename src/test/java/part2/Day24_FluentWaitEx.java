package part2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Day24_FluentWaitEx {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("standard_user");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		//FLuent wait:
		
	WebElement login = driver.findElement(By.cssSelector("input.btn_action"));
		FluentWait fwait = new FluentWait(driver);
		fwait.pollingEvery(Duration.ofSeconds(1));
		fwait.withTimeout(Duration.ofSeconds(10));
		fwait.until(ExpectedConditions.elementToBeClickable(login));
		
		login.click();
		
		
		
		
		
		

	}

}
