package scrollingConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByAmount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		Actions act= new Actions(driver);
		act.scrollByAmount(0, 300).perform(); //scroll down 
		Thread.sleep(1000);
		act.scrollByAmount(0, 800).perform();//scroll down
		Thread.sleep(2000);
		act.scrollByAmount(0, -200).perform();//scroll up
		Thread.sleep(3000);
		act.scrollByAmount(0, -400).perform();//scroll up
		Thread.sleep(1000);
		driver.close();

	}

}
