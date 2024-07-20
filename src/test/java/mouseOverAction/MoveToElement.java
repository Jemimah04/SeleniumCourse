package mouseOverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aliexpress.com/ ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@class='_24EHh']")).click();

		WebElement trg = driver.findElement(By.xpath("//a[text()='Home & Garden']"));
		Actions a= new Actions(driver);
		a.moveToElement(trg).build().perform(); //here mouse is placed over Home&garden ,. it wont perform click action. just move cursor to that webelemtn
		
		
	}

}
