package mouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickonElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://naturalicecreams.in/");
Thread.sleep(1000);

WebElement products = driver.findElement(By.xpath("(//span[contains(text(),'Products')])	[1]	"));
Actions act= new Actions(driver);

act.moveToElement(products).build().perform();
Thread.sleep(3000);

WebElement roundTheYear = driver.findElement(By.xpath("(//a[@href='/category/round-the-year/'])[1]"));


act.moveToElement(roundTheYear).click().build().perform();

//WebElement festive = driver.findElement(By.xpath("(//a[text()='Festive Special'])[1]"));
//Thread.sleep(3000);
//act.moveToElement(festive).click(festive).perform();


}

}
