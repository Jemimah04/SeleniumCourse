package popupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_SimpleAlert {
	public static void main(String[] args) throws InterruptedException {	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		search.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String alertMessage = alert.getText();
		System.out.println("Alert message in the alert pop is :"+alertMessage);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		driver.close();
	}

}
