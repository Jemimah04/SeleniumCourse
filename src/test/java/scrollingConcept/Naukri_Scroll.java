package scrollingConcept;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Naukri_Scroll {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Thread.sleep(2000);
		
		//click on register
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		//to scroll till I'm Experienced 
		Actions act= new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		driver.findElement(By.xpath("//h2[contains(text(),'experienced')]")).click();
		Thread.sleep(2000);
		
		//take entire webpage ss
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./Screenshot/Naukri.png");
		FileHandler.copy(src, trg);
		
	}

}
