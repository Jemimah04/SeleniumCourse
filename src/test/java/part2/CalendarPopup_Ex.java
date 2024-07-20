package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarPopup_Ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
	//inspect the date
	driver.findElement(By.xpath("//a[contains(@class,'highlight')]")).click();//highlight is a unique word for the current date. other dates doesnt have this highlight word. so to select current date, use this unique word
	Thread.sleep(3000);
	//to select another date, again click on calendar and select the date
	
	driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	driver.findElement(By.xpath("//a[text()='13']")).click();
	
	
	}

}
