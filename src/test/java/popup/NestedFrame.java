package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		
		driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
		WebElement top = driver.findElement(By.xpath("//frame[@src=\"/frame_top\"]"));
		driver.switchTo().frame(top);
				
		WebElement leftFrame = driver.findElement(By.xpath("//frame[@src=\"/frame_left\"]"));
		driver.switchTo().frame(leftFrame);
	String left = driver.findElement(By.xpath("//body[contains(text(), '  LEFT' )]")).getText();
		
		System.out.println(left);
		
	//from left frame switch to middle... we can switch to topframe and then go to middle frame for thsi use parentFrame() method
		
//	driver.switchTo().parentFrame();
//	//from parent swithc to middle frame using name attribute:
//	driver.switchTo().frame("frame-middle"); //name attribute used to swithc to middle frame
//	//write path for middle frame
//	String mid = driver.findElement(By.xpath("//div[@id='content']")).getText();
//	System.out.println(mid);
	Thread.sleep(1000);
	//from mid to parent switched
	
	driver.switchTo().parentFrame();
	//switch from parent Top to bottom
	Thread.sleep(1000);
	WebElement bottomFrame = driver.findElement(By.xpath("//frame[@src=\"/frame_bottom\"]"));
	
	//driver.switchTo().frame("frame-bottom");
	
	//path for bottom frame:-
	String bot = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText();
		
		System.out.println(bot);
		
	}

}
