package demowebshoptestcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooksTestCase01 {

	public static void main(String[] args) throws IOException  {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Daniel\\Desktop\\PropertiesFile\\commondata.properties");
		Properties prop= new Properties();
		prop.load(fis);
		
		String url=prop.getProperty("url");
		String email=prop.getProperty("email");
		String password=prop.getProperty("password");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		//click on books
		
		driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		driver.close();
		
		
		
		

	}

}
