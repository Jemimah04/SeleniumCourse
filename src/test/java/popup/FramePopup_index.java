package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopup_index {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html ");
		
		//1st approach: switch to frame by using index . index starts with 0
//		driver.switchTo().frame(1);
//		WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
//		text.sendKeys("eldon");
//		
		//2nd approach:-
//		driver.switchTo().frame("singleframe");   //-----> id attribute
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tryphena");
//		
//		driver.switchTo().frame("singleframe");   //-----> name attribute
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("leah");
//		
		//3rd approach:-
		
		WebElement singleframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(singleframe);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("leah");
		
		
	}

}
