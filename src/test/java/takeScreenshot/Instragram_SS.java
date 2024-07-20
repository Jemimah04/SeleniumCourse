package takeScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Instragram_SS {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
Thread.sleep(1000);
//to capture webelement:
//S1: path for that particular webelement
WebElement loginFB = driver.findElement(By.xpath("//span[text()='Log in with Facebook']/ancestor::button[@type='button']"));
Thread.sleep(1000);
//create src
File src = loginFB.getScreenshotAs(OutputType.FILE);
Thread.sleep(1000);
//create trg
File trg = new File("./Screenshot/Instagram.png");
//copy to src to trg
FileHandler.copy(src, trg);






	}

}
