package takeScreenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class EntireWebpage_SS {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalenfield.com/in/en/motorcycles/new-himalayan/");
		
		driver.findElement(By.id("close-gdpr")).click();
		Thread.sleep(1000);
		
		//pre-condition: to create a folder for screenshot(SS)
		
		//Step1: typecasting explicitly
		TakesScreenshot ts= (TakesScreenshot)driver;
		
		//Step2: to capture ss
File src = ts.getScreenshotAs(OutputType.FILE); //output defines the output type of the screenshot
		//step3: create target folder
File trg = new File("./Screenshot/royalenfield.png");
	//Step 4: copy from src to target
FileHandler.copy(src, trg);
		
driver.close();
	}

}
