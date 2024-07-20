//to get all names of products  from webpage


package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartAllElements {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("phones");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> allNames = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));//return type is List so save in a var.
		
		
		int count=0;
		for(WebElement name: allNames) {  //foreach loop is used to print all the names of the webelement in one 
			
					System.out.println(name.getText());  //to get name , we use getTExt()
					count++; //   to get total count elemnts
		}
		
		System.out.println("total: " +count);
	}

}
