package popupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BurgerKing_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://burgerking.in/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		Alert alert= driver.switchTo().alert();
		Thread.sleep(2000);
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		//driver.close();
		
	}

}
