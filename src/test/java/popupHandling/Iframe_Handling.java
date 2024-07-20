package popupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/iframe");
Thread.sleep(2000);
//3 approach to switch to frame
//1.frame(int index)
//driver.switchTo().frame(0); ///there is only 1 frame in the webpage , index starts from 0 so. we gave frame(0)

//2.frame(String nameorid)
//driver.switchTo().frame("mce_0_ifr");

//3.frame(webElement element)
WebElement frameEle = driver.findElement(By.xpath("//iframe[@title='Rich Text Area']"));

driver.switchTo().frame(frameEle);
String frameMsg = driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
System.out.println("Frame Msg:"+frameMsg);


//switch to main frame--2 ways : 1.parentFrame(), 2. defaultContent()

driver.switchTo().parentFrame();
String mainFrameMsg = driver.findElement(By.xpath("//h3[contains(text(), 'An iFrame')]")).getText();
System.out.println("Main Frame msg: "+mainFrameMsg);

Thread.sleep(2000);
driver.close();
	
}

}
