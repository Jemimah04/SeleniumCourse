package part2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18_GoogleMultElements {

	public static void main(String[] args) throws Throwable {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		//fetch the sugestions from google 
		driver.findElement(By.xpath("(//textarea[@autocomplete='off'])")).sendKeys("books");
		
		Thread.sleep(1000);
		List<WebElement> books = driver.findElements(By.xpath("//li[@class='sbct PZPZlf']"));
		
		Thread.sleep(1000);
		
		//int count=0;
		for (WebElement booksSuggestion : books) {
			System.out.println(booksSuggestion.getText());
			Thread.sleep(1000);
			String book1 = booksSuggestion.getText();
			//count++;
			Thread.sleep(1000);
			if(book1.contains("bookstores indiranagar")) {
				booksSuggestion.click();
				Thread.sleep(1000);
			}
		}
		//System.out.println("no of suggestions for books in google : "+count);
	}
}
