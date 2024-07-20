package part2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day19_RobotClasskeys {

	public static void main(String[] args) throws Throwable   {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("puma");
		//create obj for Robot class
		Robot rob= new Robot();
		rob.keyPress(KeyEvent.VK_ENTER); //Keyevent -class whcih has all virtual keys
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		

	}

}
