package popupHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Irctc_tabHandling {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications"); 
				
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		WebElement personDisability = driver.findElement(By.xpath("//span[contains(text(), 'Person With')]"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", personDisability);
		Thread.sleep(3000);
					
		//to close disha
		driver.findElement(By.id("disha-banner-close")).click();
		//close ad
		driver.findElement(By.cssSelector("[src=\"https://cdn.nlpcaptcha.in/cdn_images/cubebox/cross.png\"]")).click();
		Thread.sleep(3000);
		
		//explicitly wait
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//i[@class='fa fa-twitter']"))));
		
		WebElement twitter = driver.findElement(By.xpath("//i[@class='fa fa-twitter']"));
		
		js.executeScript("arguments[0].click();", twitter);
		
		
		//twitter.click();
		Thread.sleep(3000);
				
	}

}
