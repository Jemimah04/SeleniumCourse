package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//relative xpath - syntax 1:
		////htmltag=[@AttributeName='AttributeValue']
		
		driver.findElement(By.xpath("//img[@alt='Grocery']")).click();
		
		//relative xpath - syntax 2:
		//htmltag[text()='AttributeValue'] --> works only for visible text and supports all type of htmltag
		//for visible text we wont get img
		
		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
		
		
		

	}

}
