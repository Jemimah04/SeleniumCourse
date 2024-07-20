package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day22_HandlingScrollBarJSE_Coordinates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement games = driver.findElement(By.xpath("//a[text()='Games']"));
		System.out.println(games.getLocation().getX());
		System.out.println(games.getLocation().getY());
		
			JavascriptExecutor test = (JavascriptExecutor)driver;
		
		test.executeScript("window.scrollBy(538,786)");
		games.click();
		
	}

}
