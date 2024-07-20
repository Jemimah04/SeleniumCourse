package part2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day23_SVGHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
	
		driver.get("https://www.kayak.co.in/ ");
		driver.manage().window().maximize();
				
		Thread.sleep(3000);
		//synatx to use SVG element:
		//*[name()='svg' and @AttributeName='AttributeValue']
		
		//driver.findElement(By.xpath("//*[name()='svg' and @class='c8LPF-icon']")).click();
		WebElement advertise = driver.findElement(By.xpath("//span[text()='Advertise with us']"));
		Thread.sleep(3000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", advertise);
		Thread.sleep(3000);
	
		String priceLine = driver.findElement(By.xpath("(//*[name()='svg' and @class='r60B-logo'])[4]")).getTagName();
		
		System.out.println(priceLine);
		
	}

}
