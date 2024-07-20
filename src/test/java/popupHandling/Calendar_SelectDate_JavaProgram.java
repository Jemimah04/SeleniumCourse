package popupHandling;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_SelectDate_JavaProgram {

	public static void main(String[] args) throws InterruptedException {
//to get current date by using Calendar class
		Calendar cal=Calendar.getInstance();
		
		Date date= cal.getTime();
		
		System.out.println(date); //here date comes in this format "Mon May 27 15:28:30 IST 2024"
		
	//to get date format in our way use this class
		SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/YYYY"); //dd shd ne in lowercase
		
		String modifiedDate = sdf.format(date);
		System.out.println(modifiedDate); //here the format is like this 27/05/24, 3:30 pm
		//but in webpage , the format is MM/dd/YYYY
//so we give the required format in arguments of SimpelDateFormat
		//after passing args in SDF, we get desired date format
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(3000);
		//calendar is placed inside frame so inspect frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);
		//inspect the calendar
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("datepicker")).sendKeys(modifiedDate,Keys.ESCAPE);//escape is to get the calendar pop up go off
		
		

		
		
		
		
		
	}

}
