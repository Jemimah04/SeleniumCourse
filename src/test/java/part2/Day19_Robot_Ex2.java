package part2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19_Robot_Ex2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
	
		//robot class approach:
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		Robot ro= new Robot();
//		ro.keyPress(KeyEvent.VK_ENTER);
//		ro.keyRelease(KeyEvent.VK_ENTER);
//		driver.findElement(By.cssSelector("#password")).sendKeys("standard_user");
//		ro.keyPress(KeyEvent.VK_ENTER);
//		ro.keyRelease(KeyEvent.VK_ENTER);
//		
		//with keystroke class
		//driver.findElement(By.id("user-name")).sendKeys("standard_user", Keys.TAB, "standard_user", Keys.ENTER);
	
	//sceanario: use the username data and copy in pw field
		//so we use robot class to select username(ctrl+A) and copy in pw field(crtrl+c)
		//now we need to move to pw field , so use Tab key and in pw field, use ctrl+v to past.
		
		Robot rob= new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		rob.keyPress(KeyEvent.VK_COPY);
		rob.keyPress(KeyEvent.VK_PASTE);
		
		
		
		
		
	}
	

}
