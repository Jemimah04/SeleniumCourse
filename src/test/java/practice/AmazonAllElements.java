package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAllElements {

	public static void main(String[] args) {
	
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Bluetooth");
		driver.findElement(By.id("nav-search-submit-button")).click();
	List<WebElement> AllName = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

	
	int count=0;
	for(WebElement name: AllName)
	{
		System.out.println(name.getText());
		count++;
		
	}
	
	System.out.println("total count : "+ count);
	
	
	
	
	
	}

}
