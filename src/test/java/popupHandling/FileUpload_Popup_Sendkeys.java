package popupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_Popup_Sendkeys {

	public static void main(String[] args) throws InterruptedException {
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
		
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\Daniel\\Desktop\\Selenium notes by Mam\\Selenium-Rakesh\\Day01.pdf");
		
		
		
		
	}

}
