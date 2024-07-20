package assertion_pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase {

	@Test
	public void testCase() {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		//to check the title of the webpage is opened , we use if-else stt . instead of that we use assertion
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		System.out.println("Demo web shop page is displayed");
		
		driver.findElement(By.partialLinkText("Books")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books");
		System.out.println("demo web shop books page displayed");
		
		//to check whether ficionex book is displayed in the page
		String actualProdName = driver.findElement(By.xpath("//a[text()='Fiction EX']")).getText();
		
		Assert.assertEquals(actualProdName, "Fiction EX");
		System.out.println("Fiction ex book is present");
		driver.close();
		
	}
	
	
	
	
}
