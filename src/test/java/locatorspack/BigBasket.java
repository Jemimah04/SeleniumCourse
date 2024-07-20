package locatorspack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("div.Header___StyledQuickSearch2-sc-19kl9m3-0 gzbZOD")).sendKeys("mango", Keys.ENTER);
		
		
	}

}
