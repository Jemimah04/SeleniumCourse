package popupHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUpHandling {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); //---syntax for authentication pop up
	Thread.sleep(2000);
	
	
//	String textMsg = driver.findElement(By.xpath("//p[contains(text(),'Congratulations')]")).getText();	
//System.out.println(textMsg);

}
}
