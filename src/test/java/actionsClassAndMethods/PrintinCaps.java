package actionsClassAndMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrintinCaps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://www.google.com/");

//S1- create obj for Actions class
Actions act= new Actions(driver);

//S2-Press the Key to write in Caps. eg: SELENIUM
act.keyDown(Keys.SHIFT).sendKeys("selenium").build().perform();
//S3- Rlease the key

act.keyUp(Keys.SHIFT).build().perform();

Thread.sleep(3000);
act.keyDown(Keys.BACK_SPACE).build().perform();
Thread.sleep(3000);
act.keyDown(Keys.BACK_SPACE).build().perform();
Thread.sleep(3000);
act.keyDown(Keys.BACK_SPACE).build().perform();
Thread.sleep(3000);
act.keyDown(Keys.BACK_SPACE).build().perform();
Thread.sleep(3000);
act.keyDown(Keys.BACK_SPACE).build().perform();
Thread.sleep(3000);
act.keyDown(Keys.BACK_SPACE).build().perform();
Thread.sleep(3000);
act.keyDown(Keys.BACK_SPACE).build().perform();
Thread.sleep(3000);
act.keyDown(Keys.BACK_SPACE).build().perform();


//act.keyDown(Keys.SHIFT).sendKeys("")


	
	}

}
