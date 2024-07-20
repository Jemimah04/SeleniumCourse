package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day21_Assignment {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
driver.findElement(By.xpath("//p-dropdown[@id='journeyClass']")).click();


//selecteing executive ac chair in all classes
WebElement allClasses = driver.findElement(By.xpath("//span[text()='Exec. Chair Car (EC)']"));
allClasses.click();

//selecting tatkal in general
driver.findElement(By.xpath("//span[text()='GENERAL']")).click();
WebElement tatkal = driver.findElement(By.xpath("//span[text()='TATKAL']"));
tatkal.click();


	}

}
