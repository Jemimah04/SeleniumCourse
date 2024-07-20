package mouseOverAction;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {
public static void main(String[] args) throws InterruptedException, Throwable {
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);

WebElement fashion = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[3]"));

Actions act= new Actions(driver);
act.moveToElement(fashion).click().build().perform();
Thread.sleep(2000);

WebElement topWear = driver.findElement(By.xpath("//a[@class='_1BJVlg _11MZbx']"));
Thread.sleep(2000);
act.moveToElement(topWear).build().perform();
Thread.sleep(2000);
WebElement tShirt = driver.findElement(By.xpath("(//a[@class='_3490ry'])[2]"));
 act.moveToElement(tShirt).click().build().perform();
 Thread.sleep(2000);
System.out.println(driver.getTitle());
Thread.sleep(2000);
//capture SS
TakesScreenshot tss= (TakesScreenshot)driver;
File src = tss.getScreenshotAs(OutputType.FILE);
File trg = new File("./Screenshot/FlipkartTShirt.png");
FileHandler.copy(src, trg);
//driver.close();
}
}
