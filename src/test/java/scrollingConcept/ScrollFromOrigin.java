package scrollingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollFromOrigin {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/ ");
Thread.sleep(2000);

ScrollOrigin sc = ScrollOrigin.fromElement(driver.findElement(By.xpath("//nav[@id='td-section-nav']")));

Actions act= new Actions(driver);
act.scrollFromOrigin(sc, 0, 400).perform(); //scroll down
Thread.sleep(2000);
act.scrollFromOrigin(sc, 0, 200).perform(); //down
Thread.sleep(2000);
act.scrollFromOrigin(sc, 0, -300).perform();//up	
	
}
	

}
