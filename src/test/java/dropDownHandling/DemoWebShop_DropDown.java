//Navigate to demo web shop, perform login, click on books link, sort by low to high and capture the screen shot.
//https://demowebshop.tricentis.com/

package dropDownHandling;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWebShop_DropDown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
 driver.get("https://demowebshop.tricentis.com/");

//explicitly wait
WebDriverWait wait= new  WebDriverWait(driver, Duration.ofSeconds(10));

 driver.findElement(By.xpath("//a[text()='Log in']")).click();
 WebElement userName = driver.findElement(By.cssSelector("[id='Email']"));
 userName.sendKeys("eilenesjemimah@gmail.com");
 wait.until(ExpectedConditions.elementToBeClickable(userName));
 WebElement passWord = driver.findElement(By.xpath("//input[@id='Password']"));
 passWord.sendKeys("T3xas123");
 wait.until(ExpectedConditions.elementToBeClickable(passWord));
 
 driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
 
 //path for books
driver.findElement(By.xpath("(//a[contains(text(),'Books')])[1]")).click();


//path for the position (dropdown)to display the books.
WebElement position = driver.findElement(By.id("products-orderby"));
Thread.sleep(1000);
//create object for Select class
Select s= new Select(position);

//select the options from the dropdown
s.selectByIndex(3);

//capture the webpage
TakesScreenshot ts= (TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File trg = new File("./Screenshot/DemoWebShop.png");
FileHandler.copy(src, trg);








	}

}
