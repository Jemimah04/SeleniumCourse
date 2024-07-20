package popupHandling;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnowCityBlr_WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		//https://snowcityblr.com/ --click on contactus-->directions in map click--new tab--fetch title of new tab
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snowcityblr.com/");
		Thread.sleep(2000);
		
		//click on ContactUS
		driver.findElement(By.xpath("//li[@id='menu-item-16074']")).click();
		//directions is inside a frame, so switch to that frame
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		//to click on directions
	WebElement dir = driver.findElement(By.xpath("//div[text()='Directions']"));
	dir.click();
	Thread.sleep(2000);
	System.out.println(dir.getText());//to print the text of the web element
	//to get the count of tabs opened
	Set<String> allTabs = driver.getWindowHandles();
	System.out.println(allTabs.size());
	Thread.sleep(2000);
	for (String newTab : allTabs) {
		Thread.sleep(2000);
		//to switch the driver from mainpage to next tab
		driver.switchTo().window(newTab);
		if(driver.getTitle().contains("Google Maps")) //if the tab contains the text google maps, then print it
		{
			System.out.println(driver.getTitle());
		}
		
	}
	
	
	
	
	}

}
