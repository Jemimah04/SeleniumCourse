package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_AncestorDescendant {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		 WebElement phones = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		 phones.sendKeys("Phones");
		 phones.submit();
		 
		String price = driver.findElement(By.xpath("//div[contains(text(),'REDMI 12 5G (Moonstone Silver')]/ancestor::a[@class='CGtC98']/descendant::div[contains(text(),'11,999')]")).getText();
				
		System.out.println(price);

	}

}
//