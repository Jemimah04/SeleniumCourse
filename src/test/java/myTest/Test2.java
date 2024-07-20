package myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.freecrm.com/");
driver.manage().window().maximize();

driver.findElement(By.id("cf_consent-buttons__accept-all")).click();
driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();

		
		
		
		
		
		
	}

}
