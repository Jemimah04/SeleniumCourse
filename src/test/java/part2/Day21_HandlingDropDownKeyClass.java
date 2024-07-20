package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day21_HandlingDropDownKeyClass {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//to click on create an account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		
		
		//Approach1:-drop down to select data from app using Keys class
		WebElement dateList = driver.findElement(By.name("birthday_day"));//to click on the date
		dateList.click();  //to select the date 7 we need to press 2 arrow keys down as by default it shows the current date. 
		//and today's current date is 5th may 2024, so to select the date 7 th may , i should press arrow down key 2 times to drop from 5 to 7
		dateList.sendKeys(Keys.ARROW_DOWN);//
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ENTER);
		
		//to select month:jan
		WebElement monthList = driver.findElement(By.name("birthday_month"));
		monthList.click();
		Thread.sleep(1000);
		monthList.sendKeys(Keys.ARROW_UP);
		Thread.sleep(1000);
		monthList.sendKeys(Keys.ARROW_UP);
		Thread.sleep(1000);
		monthList.sendKeys(Keys.ARROW_UP);
		Thread.sleep(1000);
		monthList.sendKeys(Keys.ARROW_UP);
		monthList.sendKeys(Keys.ENTER);
		
		//to select year: 2018
		WebElement yearList = driver.findElement(By.name("birthday_year"));
		yearList.click();
		Thread.sleep(1000);
		yearList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		yearList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		yearList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		yearList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		yearList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		yearList.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		yearList.sendKeys(Keys.ENTER);
		
		
	}

}
