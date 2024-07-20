package popup;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramePopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	
		//to switch into the frame where the element is present: ---check whether ele is in frame. //iframe 1 out of 1
		
		//1st approach: switch to frame by using index . index starts with 0
		driver.switchTo().frame(0);
		
		
		
		//drag element:
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		//drop element
	WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		//to perform drag and drop , we need to create obj for Action class
	Actions act = new Actions(driver);
	act.dragAndDrop(drag, drop).perform();
	
		
		
	}

}
