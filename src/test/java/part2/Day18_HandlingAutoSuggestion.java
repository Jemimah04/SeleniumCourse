package part2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day18_HandlingAutoSuggestion {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//fetch the suggestion while searching product in searchbar
		driver.findElement(By.cssSelector("[id='twotabsearchtextbox']")).sendKeys("soft toys");
		
		Thread.sleep(1000);
		
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		int count=0;
		Thread.sleep(1000);
		for (WebElement allSugg : suggestion) {
			System.out.println(allSugg.getText());
			String girlToy = allSugg.getText();
			count++;
			
			Thread.sleep(1000);
			
//			if(girlToy.contains("soft toys for baby girl")) {
//				allSugg.click();
//			}
//			
//			
			
		}System.out.println("total: "+count);
			
	}

}
