package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingEmptyBrowser {

	public static void main(String[] args) {
		
		//no need to downlaod chomedriver exe file, we use webdrivermanager dependency and it will update the broswer
		
		// selenium version:  webdrivermanager version: 5.8.0
//		WebDriverManager.chromedriver().setup();//type web and press cntrl+space to select the webdrivermanager from the lsit
//		WebDriver driver = new ChromeDriver();
//		
//		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver2= new FirefoxDriver();
//		
//		WebDriverManager.edgedriver().setup();
//		WebDriver driver3= new EdgeDriver();
//		
		
		
		//case 3: selenium version: 4.19.1 
		//WebDriver driver = new ChromeDriver();
		WebDriver driver2= new EdgeDriver();
		

	}

}
