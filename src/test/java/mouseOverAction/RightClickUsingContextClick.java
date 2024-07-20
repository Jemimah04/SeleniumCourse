package mouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUsingContextClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
Thread.sleep(2000);

//path to rightclick on the element
WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

Actions act= new Actions(driver);
act.contextClick(rightClick).build().perform();

//to click on Quit option
WebElement quitOption = driver.findElement(By.xpath("//span[text()='Quit']"));
act.click(quitOption).build().perform();





}

}
