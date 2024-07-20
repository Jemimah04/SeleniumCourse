package demowebshoptestcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import workingwithtestng.BaseClass;

public class BookTestCase01_TestNG extends BaseClass{
	
	
	@Test
	public void booksTestCase01() {
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
	}

}
