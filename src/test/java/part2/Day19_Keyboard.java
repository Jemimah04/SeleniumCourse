package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19_Keyboard {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//approach 1:- to send username to the app
//		WebElement UserName = driver.findElement(By.name("user-name"));
//		UserName.sendKeys("standard_user",Keys.ENTER);
		
		//approach 2: to send username and pw in two line
		Thread.sleep(3000);
		WebElement UNPW = driver.findElement(By.name("user-name"));
		Thread.sleep(3000);
		UNPW.sendKeys("standard_user", Keys.TAB, "secret_sauce", Keys.ENTER);
		
		//approach 3: to send un and pw in one line
		//driver.findElement(By.name("user-name")).sendKeys("standard_user", Keys.TAB, "secret_sauce", Keys.ENTER);
	}

}
