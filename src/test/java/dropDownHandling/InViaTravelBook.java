package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InViaTravelBook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://in.via.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='No thanks!']")).click();
Thread.sleep(1000);

driver.findElement(By.xpath("//span[text()='Cruise ']")).click();
Thread.sleep(1000);

WebElement river = driver.findElement(By.xpath("//select[@name='place']"));
Select s= new Select(river);
Thread.sleep(1000);
s.selectByVisibleText("Chennai");

Thread.sleep(1000);
WebElement days = driver.findElement(By.id("operator"));
Select s2= new Select(days);
s2.selectByVisibleText("1 To 3 night(s)");
Thread.sleep(1000);
WebElement date = driver.findElement(By.xpath("//select[@name='sailDate']"));
Select s3= new Select(date);
s3.selectByVisibleText("Jul-2024");
Thread.sleep(1000);


WebElement cruiseLines = driver.findElement(By.xpath("//select[@id='cruiselines']"));
Select s4= new Select(cruiseLines);
s4.selectByVisibleText("Sunburn Cordelia Cruises");
driver.findElement(By.xpath("//button[text()='Search Cruise']")).click();


	}

}
