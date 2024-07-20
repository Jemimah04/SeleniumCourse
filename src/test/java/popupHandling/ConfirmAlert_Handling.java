package popupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert_Handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert alert = driver.switchTo().alert();
		//to get alert message:
		String alertMsg = alert.getText();
		System.out.println(alertMsg);
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
		String resultMsg = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		System.out.println(resultMsg);
		
		
	}

}
