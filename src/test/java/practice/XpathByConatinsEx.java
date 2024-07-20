package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByConatinsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		
								//case3: xpath by containsAttribute()
							//syntax: //htmltag[contains(@AttributeName, 'AttributeValue')] 
		
		
		driver.findElement(By.xpath("//input[contains(@placeholder, 'Search Am')]")).sendKeys("toys");
		//driver.findElement(By.xpath("//input[contains(@id,'nav-se')]")).click();

						//case4: xpath by contains Text()
		//syntax: //htmltag[contains(text(), 'AttributeValue')]
//driver.findElement(By.xpath("//a[contains(text(), \"Today's Deals\")]")).click();

//driver.findElement(By.xpath("//span[contains(text(), 'Mobiles & ')]")).click();
		




		
	}

}
