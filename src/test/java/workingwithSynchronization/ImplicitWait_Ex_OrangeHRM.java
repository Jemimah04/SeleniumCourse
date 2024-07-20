package workingwithSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_Ex_OrangeHRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

driver.findElement(By.cssSelector("[name='sdkljasdk']")).sendKeys("Admin"); // here the atteibute name is wrong , so the driver will search for the
																			//web element for every 0.5sec till 10 secs. after that it will throw the 
																			//exception.
driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();


	}

}
