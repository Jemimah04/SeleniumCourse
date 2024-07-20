package part2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day22_HandlingScrollBarRobotClass {

	public static void main(String[] args) throws AWTException, Throwable {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");

Robot rob= new Robot();
rob.keyPress(KeyEvent.VK_PAGE_DOWN);
rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(1000);

rob.keyPress(KeyEvent.VK_PAGE_DOWN);
rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(1000);
rob.keyPress(KeyEvent.VK_PAGE_DOWN);
rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(1000);


rob.keyPress(KeyEvent.VK_PAGE_UP);
rob.keyRelease(KeyEvent.VK_PAGE_UP);
Thread.sleep(1000);

rob.keyPress(KeyEvent.VK_PAGE_UP);
rob.keyRelease(KeyEvent.VK_PAGE_UP);
Thread.sleep(1000);




	}

}
