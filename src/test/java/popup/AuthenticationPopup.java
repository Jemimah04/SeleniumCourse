package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth ");
		driver.manage().window().maximize();
		
		//syntax for authentication pop up:
		//driver.get("https://username:password@url")
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
