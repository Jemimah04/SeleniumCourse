package selftest;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlinDropDown_KeyStrokeClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		//Approach1: - KeyStroke class---2 types  (1) Keys class (2) Robot Class
		WebElement allClasses = driver.findElement(By.xpath("//div[@class='ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
		allClasses.click();
		Thread.sleep(1000);
//		
//		Robot rob= new Robot();
//		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
//		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		Thread.sleep(1000);
//		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
//		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		Thread.sleep(1000);
//		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
//		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		Thread.sleep(1000);
//		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
//		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
//		Thread.sleep(1000);
//		
//		rob.keyPress(KeyEvent.VK_ENTER);

	//Approach2:- Select Class
	
		
		
		
		
		

}}

