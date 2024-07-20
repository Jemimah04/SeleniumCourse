package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NestedFrame2 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/frames");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
	//switch to middle
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		//path for middle
		String mid = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
		
		System.out.println(mid);
		
		
//swithc to main frame
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-bottom");
	String bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		
		System.out.println(bottom);
	
	
		
		
	}

}
