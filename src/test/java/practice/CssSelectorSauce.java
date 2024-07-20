package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorSauce {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		

//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//syntax 1:
//		driver.findElement(By.cssSelector("[type='submit']")).click();
		
	
		//syntax 2:
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		//synatx 3:
		//driver.findElement(By.cssSelector("#login-button")).click();
		//synatx 4:
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		//synatx 5:
		//driver.findElement(By.cssSelector(".btn_action")).click();
		//syntax 6:
		//driver.findElement(By.cssSelector(".product_sort_container")).click();
		//synatx 6:
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		
		
	}

}
