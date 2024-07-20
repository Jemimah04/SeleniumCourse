package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day20_DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	
	WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
	WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
	
	Actions act= new Actions(driver);
//	act.clickAndHold(drag).perform();
//	act.release(drop).perform();	
	//above 22,23 lines can be written using one direct method
	act.dragAndDrop(drag, drop).perform();
	
	}

}
