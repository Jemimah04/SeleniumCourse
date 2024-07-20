package assertion_pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Example {
	
	@Test
	public void testCase() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(driver.getTitle(), "OrangeHRM");
		System.out.println("Home page displayed");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		sa.assertTrue(driver.getCurrentUrl().contains("dadasdal"));
		System.out.println("Login successful....");
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		sa.assertTrue(driver.getCurrentUrl().contains("login"));
		System.out.println("logout success...");
		
		driver.close();
		sa.assertAll(); //--complisory method. if given it will collect exception of assertion in this line.
		//if not given, even though validation fails, we get pass result only.
		
		
		
		
		
		
		
	}
	
	

}
