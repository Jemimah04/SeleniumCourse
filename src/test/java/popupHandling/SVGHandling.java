package popupHandling;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SVGHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='Stay signed out']")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		//to locate svg tag element
		
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_h']/..")).click(); //here we take svg tag name and also class attribute to get 1 of 1
						//and from child we are traversing to parent. so we use /..
		
	
		TakesScreenshot ts= (TakesScreenshot) driver;
		Thread.sleep(3000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshot/Google.png");
		FileHandler.copy(src, trg);
		
	
		
	}

}
