package selftest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ProkabaddiTest_Sibling {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.prokabaddi.com/");
		
		String points = driver.findElement(By.xpath("//p[text()='Tamil Thalaivas']/../../../following-sibling::div[@class='table-data points']")).getText();
		
		System.out.println("Tamilnadu:"+points);
		
		
		WebElement pointGujarat = driver.findElement(By.xpath("//p[text()='Gujarat Giants']/../../../following-sibling::div[@class='table-data points']"));
		System.out.println("Gujarat:"+pointGujarat.getText());
		
		WebElement delhi = driver.findElement(By.xpath("//p[.='Dabang Delhi K.C.']/../../../preceding-sibling::div[@class='table-data position']"));
		System.out.println("delhi:" +delhi.getText());
	
	
	
	
	
	}
	
	


	
	
	
	
	
	
	
}
