package popupHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
	
		String mainPageTitle = driver.getTitle();
		System.out.println(mainPageTitle);
		
		driver.findElement(By.xpath("//a[text()='Google+']")).click();
		
		String mainPageID = driver.getWindowHandle();
		System.out.println(mainPageID);
		Thread.sleep(2000);
		
		Set<String> allTabsID = driver.getWindowHandles();
		System.out.println("Count of tabs:"+allTabsID.size());
		System.out.println(allTabsID);
		
		for (String IDs : allTabsID) {
			driver.switchTo().window(IDs);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());	
		}		
	}

}
