package popupHandling;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class IRCTC_DriverFocus_FB {

	public static void main(String[] args) throws InterruptedException, IOException {
		//to disable notification pop up
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications"); 
				
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		//scroll down to reach social links location..use JavascriptExecutor to scroll above the person disabilty
		WebElement personDisability = driver.findElement(By.xpath("//span[contains(text(), 'Person With')]"));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", personDisability);
		Thread.sleep(3000);
					
		//to close disha
		driver.findElement(By.id("disha-banner-close")).click();
		//close ad
		driver.findElement(By.cssSelector("[src=\"https://cdn.nlpcaptcha.in/cdn_images/cubebox/cross.png\"]")).click();
				
		//facebook
	  driver.findElement(By.xpath("//i[@class='fa fa-facebook-f']")).click();
	  String mainPage = driver.getTitle();
	  System.out.println(mainPage); 
	  Thread.sleep(3000);
		//whatsapp
	  WebElement whatsapp = driver.findElement(By.xpath("//a[@alt='IRCTCofficial whatsapp']"));
	  whatsapp.click();
	  Thread.sleep(3000);
	  //youtube
	 WebElement youtube = driver.findElement(By.xpath("//a[@alt='IRCTCofficial youtube']"));
	 youtube.click();
	 Thread.sleep(3000);
	 //instagram
	 WebElement instagram = driver.findElement(By.xpath("//a[@alt='IRCTCofficial facebook']"));
	 instagram.click();
	 Thread.sleep(3000);
	 //linkedIn
	 WebElement linkedIn = driver.findElement(By.xpath("//a[@alt='IRCTCofficial linkedin']"));
	 linkedIn.click();
	 Thread.sleep(3000);
	 //telegram
	 WebElement telegram = driver.findElement(By.xpath("//a[@alt='IRCTCofficial telegram']"));
		telegram.click();
		Thread.sleep(3000);
	//pinterest
	WebElement pinterest = driver.findElement(By.xpath("//a[contains(@aria-label,'I.R.C.T.C. Official pinterest')]"));
	pinterest.click();
	Thread.sleep(3000);
	//tumblr
	WebElement tumblr = driver.findElement(By.xpath("//a[@alt='IRCTCofficial tumblr']"));
	tumblr.click();
	Thread.sleep(4000);
	//koo
	WebElement koo = driver.findElement(By.xpath("//a[@alt='IRCTCofficial Koo']"));
	koo.click();
	Thread.sleep(4000);
	//twitter
	WebElement twitter = driver.findElement(By.xpath("//i[@class='fa fa-twitter']"));
	js.executeScript("arguments[0].click();", twitter); //use javascriptexecutor to click on twitter
	Thread.sleep(3000);
	
	//change driver focus to linkedIn
	Set<String> subTabs = driver.getWindowHandles();
	for (String sub : subTabs) {
		driver.switchTo().window(sub);
		Thread.sleep(3000);
		
		
		if(driver.getTitle().contains("LinkedIn"))
		{
			System.out.println("the LinkedIn sub tab title is: "+driver.getTitle());
			TakesScreenshot ts= (TakesScreenshot) driver;
			Thread.sleep(3000);
			File source = ts.getScreenshotAs(OutputType.FILE);
			File trg = new File("./ScreenShot/LinkedInIRCTC.png");
			FileHandler.copy(source, trg);
		}
		else
			driver.close();
			
	}
	System.out.println("the total no.of tabs opened is: "+subTabs.size());
			
	}

}
