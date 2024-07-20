package part2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18_Flipkart_HandlingMultipleElements {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();

driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nike");

List<WebElement> nike = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
// here, ul is the parent for the whole suggestion bar, and select the attribute in ul(ie. class) and
// then we need to go to child of the ul. ie li..nw we get 1 out 8 

Thread.sleep(1000);
for (WebElement shoes : nike) {
	System.out.println(shoes.getText());
	
	Thread.sleep(1000);
	String shoeName = shoes.getText();
	Thread.sleep(1000);
	if(shoeName.contains("nike slippers"))
	{
		shoes.click();
	}
	
	
}
		
}

}
