package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day20_DoubleClick {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html ");
		driver.manage().window().maximize();
		
		//WebElement DClick = driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
		Actions act= new Actions(driver);
		//method9: 
		//act.doubleClick(DClick).perform();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		//method10: to eliminate or to close the pop up on the webpage
		act.moveByOffset(10, 10).click().perform();  //---> can use any random axes
		
	}

}
