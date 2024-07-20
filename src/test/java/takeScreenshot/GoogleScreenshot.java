// Navigate to google, enter your name, clear and enter selenium, capture the screen shot of entire web page. Don’t use clear().

package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GoogleScreenshot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
Thread.sleep(1000);
driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Eilene");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@aria-label='Clear']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
Thread.sleep(2000);
TakesScreenshot ts= (TakesScreenshot) driver;

File src = ts.getScreenshotAs(OutputType.FILE);
 
File trg = new File("./ScreenShot/GoogleSearchText.png");

FileHandler.copy(src, trg);
		
		
	}

}
