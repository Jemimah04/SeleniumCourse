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

public class Capitals_Countries {

public static void main(String[] args) throws InterruptedException, IOException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html ");
Thread.sleep(2000);

Actions act= new Actions(driver);
//oslo-norway
WebElement Oslo = driver.findElement(By.id("box1"));
WebElement norway = driver.findElement(By.id("box101"));
act.clickAndHold(Oslo).build().perform();
act.release(norway).perform();
Thread.sleep(2000);

//Stockholm -sweden 
WebElement Stockholm = driver.findElement(By.id("box2"));
WebElement sweden = driver.findElement(By.id("box102"));
act.dragAndDrop(Stockholm, sweden).perform();
Thread.sleep(2000);

//washington-usa
WebElement washington = driver.findElement(By.id("box3"));
WebElement usa = driver.findElement(By.id("box103"));
//drag and drop washington-usa
act.dragAndDrop(washington, usa).build().perform();
Thread.sleep(2000);

//Copenhagen-denmark
WebElement Copenhagen = driver.findElement(By.id("box4"));
WebElement denmark = driver.findElement(By.id("box104"));	
act.dragAndDrop(Copenhagen, denmark).perform();
Thread.sleep(2000);

//seoul-south korea
WebElement seoul = driver.findElement(By.id("box5"));
WebElement southKorea = driver.findElement(By.id("box105"));
//drag and drop seoul-south korea using clickAndHold & release
act.clickAndHold(seoul).build().perform();
act.release(southKorea).build().perform();
Thread.sleep(2000);	

//Rome-Italy
WebElement rome = driver.findElement(By.id("box6"));
WebElement italy= driver.findElement(By.id("box106"));
act.clickAndHold(rome).perform();
act.release(italy).perform();
Thread.sleep(2000);
	
//madrid -spain
WebElement madrid = driver.findElement(By.id("box7"));
WebElement spain = driver.findElement(By.id("box107"));
act.dragAndDrop(madrid, spain).build().perform();
	
TakesScreenshot ts=(TakesScreenshot)driver;
File src = ts.getScreenshotAs(OutputType.FILE);
File trg=new File("./Screenshot/Countries.png");
FileHandler.copy(src, trg);	
}

}
