package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day21_DropDownHandleusingSelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//to click on create an account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(1000);
		//using select class:- (3 ways) 
		// (1) using index (2) using value (3) using visibletext
		
		
		WebElement dateList = driver.findElement(By.name("birthday_day"));
		
		Select sel= new Select(dateList);
		
		sel.selectByIndex(12); //to select date 13, index value is 12 , index starts from0
//		
//		//to select month
//		WebElement monthList = driver.findElement(By.name("birthday_month"));
//		Select sele=new Select(monthList);//we need to pass the webelement, so everytime create new obj for sleect class
//		sele.selectByIndex(6);
//		
//		//to select year 2000:
//		WebElement yearList = driver.findElement(By.name("birthday_year"));
//		Select sel2= new Select(yearList);
//		sel2.selectByIndex(24);
		
		//(2) using value 
		WebElement dateList1 = driver.findElement(By.name("birthday_day"));
		Select sel3= new Select(dateList1);
		sel3.selectByValue("31");
		
		WebElement monthList = driver.findElement(By.name("birthday_month"));
		Select sel1= new Select(monthList);
		sel1.selectByValue("1");
		
		WebElement yearList2 = driver.findElement(By.name("birthday_year"));
		Select sel4= new Select(yearList2);
		
		//sel4.selectByValue("2013");
		
		//using visibletext
		sel4.selectByVisibleText("2020");
		Thread.sleep(1000);
		//sel4.selectByIndex(0);
		
	}

}
