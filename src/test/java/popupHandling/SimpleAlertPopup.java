package popupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SimpleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act= new Actions(driver);
		act.contextClick(rightClick).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Quit']")).click();
		Thread.sleep(2000);
		//to handle alert
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String message = alert.getText();
		
		System.out.println(message);
		
		Thread.sleep(2000);
alert.accept();	
	
	}

}
