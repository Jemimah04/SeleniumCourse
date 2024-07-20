package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts ");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
//	Alert alertpop = driver.switchTo().alert();
		Thread.sleep(1000);
	//alertpop.accept();
	Thread.sleep(1000);
//	String alertText = alertpop.getText();
//	
//System.out.println(alertText);
	//  driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	 Thread.sleep(1000);
	//driver.switchTo().alert().accept();	//to accept the alert
	
//	driver.switchTo().alert().dismiss(); //to dismiss the alert
	
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	 Alert msg = driver.switchTo().alert();
	 msg.sendKeys("Hi");
	 msg.accept();
	}
//hello
	//again pushing from gitbash
}
