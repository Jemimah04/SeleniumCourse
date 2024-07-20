package workingwithtestng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationAttirbute_Ex {
	
@Test(invocationCount = 3)
	public void launchBrowser() {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		
		driver.close();
	
		
		
	}
	
	
	
	
	

}
