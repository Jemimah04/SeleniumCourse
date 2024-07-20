package takeScreenshot;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SSforParticularWebElement {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		//S1: locate webelement
		//web element : Profile in myntra
		WebElement profileIcon = driver.findElement(By.xpath("//span[text()='Profile']/ancestor::div[@class='desktop-userIconsContainer']"));
		//S2: capture screenshot
		File src = profileIcon.getScreenshotAs(OutputType.FILE);
		//S3: create target folder
		File trg = new File("./Screenshot/myntraprofile.png");
		//s4: copy from src to trg
		FileHandler.copy(src, trg);
		
		driver.close();
		
		
		
		
	}

}
