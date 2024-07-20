package mouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html ");
		Thread.sleep(2000);
		
		WebElement drag = driver.findElement(By.id("box4"));
		
		WebElement drop = driver.findElement(By.id("box104"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		
		//using clickAndHold & release
		WebElement capitalOfSweden = driver.findElement(By.id("box2"));
		WebElement Sweden = driver.findElement(By.id("box102"));
		
		act.clickAndHold(capitalOfSweden).build().perform();
		act.release(Sweden).build().perform();
		
	}
	

}
