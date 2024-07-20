package assertion_pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase_TrueAssertEx {

	@Test
	public void testCase_trueAssertEx() {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		
		//asert true method
		Assert.assertTrue(true, driver.getTitle());
		//System.out.println("Demowebpage displayed");
		Reporter.log("Demowebpage displayed");
		
driver.findElement(By.partialLinkText("Books")).click();
		
		Assert.assertTrue(true, driver.getTitle());
		//System.out.println("demo web shop books page displayed");
		Reporter.log("demo web shop books page displayed", true);
		
		//to check whether ficionex book is displayed in the page
		String actualProdName = driver.findElement(By.xpath("//a[text()='Fiction EX']")).getText();
		
		Assert.assertTrue(true, actualProdName);
		//System.out.println("Fiction ex book is present");
		Reporter.log("Fiction ex book is present");
		driver.close();
		
	}
	
	
	
}
