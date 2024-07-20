package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPopUp_RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		Thread.sleep(3000);
		//scroll down till about us is visble
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		//use Actions class to scroll
		Actions act = new Actions(driver);
		act.scrollToElement(aboutUs).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		Thread.sleep(3000);
		
		//to upload resume , write path for that element
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Thread.sleep(3000);
		//to copy the file location from local/pc
		StringSelection ss= new StringSelection("C:\\Users\\Daniel\\Desktop\\Selenium notes by Mam\\Selenium-Rakesh\\Day01.pdf");
		
		Clipboard cp = Toolkit.getDefaultToolkit().getSystemClipboard(); //now copied the file location to clipboard
		cp.setContents(ss, null);
		Thread.sleep(3000);
		
		//use robot to paste the file location in the file upload popup
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	}

}
