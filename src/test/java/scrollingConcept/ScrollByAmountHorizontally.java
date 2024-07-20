package scrollingConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmountHorizontally {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboards.handmadeinteractive.com/jasonlove/ ");
	
		Thread.sleep(1000);
		
		Actions act= new Actions(driver);
		
		act.scrollByAmount(1800, 0).perform();//right
		Thread.sleep(2000);
		act.scrollByAmount(500, 0).perform();//right
		Thread.sleep(1000);
		act.scrollByAmount(-2000, 0).perform();//left
		Thread.sleep(2000);
		act.scrollByAmount(-600, 0).perform();//left
		Thread.sleep(1000);
		
		driver.close();
	}

}
