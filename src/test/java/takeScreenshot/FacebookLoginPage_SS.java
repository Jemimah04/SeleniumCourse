package takeScreenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FacebookLoginPage_SS{

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("esjemi@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(1000);
		//to take screenshot entire webpage
		TakesScreenshot ts= (TakesScreenshot)driver;
		//to capture create src 
		Thread.sleep(1000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(1000);
		//to copy to target , create target
	File trg = new File("./Screenshot/FacebookLogin.png");
		//to copy from src to trg
	FileHandler.copy(src, trg);
	}

}
