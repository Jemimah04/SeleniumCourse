package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDivisionPopup2 {

	public static void main(String[] args) throws Throwable {
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.makemytrip.com/");
	 driver.manage().window().maximize();
		
	Actions act=new Actions(driver);
	act.moveByOffset(20, 60).click().perform();
	
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[text()='May 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='29']")).click();
		
		driver.findElement(By.xpath("//div[text()='June 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='28']")).click();
	}

}
