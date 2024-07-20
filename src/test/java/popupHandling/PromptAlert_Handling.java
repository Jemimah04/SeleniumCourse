package popupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		//switch to alert 
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alert.sendKeys("Tryph&Leah");
		Thread.sleep(2000);
		//to accept the alert
		alert.accept();
		//to get the alert msg
		Thread.sleep(2000);
		String alertMsg = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
		
		
		System.out.println(alertMsg);
		
		
		
		
		
		
	}

}
