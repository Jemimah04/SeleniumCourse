package myTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("file:///C:/Users/Daniel/Desktop/Selenium%20notes%20by%20Mam/Absolute.html");
driver.manage().window().maximize();


driver.findElement(By.xpath("//html/body/div[1]/input[1]")).click();  //to click on A
List<WebElement> button = driver.findElements(By.xpath("//html/body/div[2]/input[2]"));

Thread.sleep(1000);

		
	}

}
