package popupHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_windowHandling {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.zomato.com/");
Thread.sleep(2000);
//get main page title
String mainPageTitle = driver.getTitle();
System.out.println(mainPageTitle);
Thread.sleep(2000);
//click on social media -Linkedin
driver.findElement(By.xpath("//a[@href='https://in.linkedin.com/company/zomato']")).click();
Thread.sleep(2000);
//click on social media -Instagram
driver.findElement(By.xpath("//a[@href='https://www.instagram.com/zomato/']")).click();
Thread.sleep(2000);
//click on social media- twitter
driver.findElement(By.xpath("//a[@href='https://twitter.com/zomato']")).click();
Thread.sleep(2000);
//click on social media- youtube
driver.findElement(By.xpath("//a[@href='https://www.youtube.com/zomato']")).click();
Thread.sleep(2000);
//click on social media- facebook
driver.findElement(By.xpath("//a[@href='https://www.facebook.com/zomato']")).click();
Thread.sleep(2000);	
		String mainPageID = driver.getWindowHandle();
		System.out.println(mainPageID);
		Thread.sleep(2000);
		Set<String> allTabsIDs = driver.getWindowHandles();
		System.out.println("No.of Tabs: "+allTabsIDs.size());
		System.out.println(allTabsIDs);
		for (String IDsofAll : allTabsIDs) {
			driver.switchTo().window(IDsofAll);
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			}	}}
