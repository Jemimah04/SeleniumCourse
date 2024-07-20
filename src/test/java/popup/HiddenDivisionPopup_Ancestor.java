package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopup_Ancestor{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.makemytrip.com/");
driver.manage().window().maximize();

Actions act= new Actions(driver);
act.moveByOffset(30, 40).click().perform();

driver.findElement(By.xpath("//span[text()='Departure']")).click();

//departure date:- 13th may 2024
//driver.findElement(By.xpath("//div[text()='May 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='13']")).click();
Thread.sleep(1000);

//return date : -28 may 2024
//driver.findElement(By.xpath("//span[text()='Return']")).click();
//driver.findElement(By.xpath("//div[text()='June']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='28']")).click();
//		
	//dynamic xpath:- here we are storing month and date in varaibles and using it in the path of ancestor and descendant

String month = "May 2024";

String date = "31";
driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();


//driver.findElement(By.xpath("//div[text()='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+ "']")).click();
	}

}
