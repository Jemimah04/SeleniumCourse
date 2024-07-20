//hnalding multiple elements

package part2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18_HandleMultipleElements {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//fetch total num of links present in webpage
		
//		List<WebElement> link = driver.findElements(By.xpath("//a"));
//		
//		//to print all the links in the webpage , we use foreach lopp
//		
//		int count=0;
//		for(WebElement fullLinks:link) {
//			//System.out.println(fullLinks.getText());
//			System.out.println(fullLinks.getAttribute("href"));
//			
//			count++;
//			Thread.sleep(1000);
//		}
//		System.out.println(count);
//		
		List<WebElement> input = driver.findElements(By.xpath("//input"));
		int count=0;
		
		for (WebElement inputCount : input) {
					System.out.println(inputCount.getTagName());
					count++;
							
		}
		System.out.println(count);
		
		
	}

}
