package xpathtypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXPathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();

//to click on Mobiles... using class only... used group index
driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]")).click();

		
		
}

}
