package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoIBibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.goibibo.com/");
driver.manage().window().maximize();

//to remove the Frame pop up, we need to create object for Actions and use moveByOffset(x,y) .
Actions act= new Actions(driver);
act.moveByOffset(30, 40).click().perform();
//open calendar i.e. hidden division 

driver.findElement(By.xpath("//p[text()='One-way']")).click();
driver.findElement(By.xpath("//span[text()='Departure']")).click();

//date of departure: 12-june-2024
driver.findElement(By.xpath("//div[text()='June 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='12']")).click();


//to click on one way trip
//driver.findElement(By.xpath("(//span[@class='sc-12foipm-70 bWWMhV'])[1]")).click();

WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));

//return date:
driver.findElement(By.xpath("//span[text()='Return']")).click();
WebDriverWait wait1= new WebDriverWait(driver,Duration.ofSeconds(10));

driver.findElement(By.xpath("//div[text()='July 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='4']")).click();


	}

}
