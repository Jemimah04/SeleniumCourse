package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchWebsite {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.com");
		driver.get("https://flipkart.com");
		String title = driver.getTitle(); //gives the app title, 
		//ie. if we use flipkart, the title online shopping , grocery.etc is the title.
		
		System.out.println(title);//to get the title in print stt, we need to store in a varaible and print it.
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String source = driver.getPageSource(); //to get the pagesource code of the app. manually we can do tht by rightclick on
												//website, select viewpagesource. 
		//System.out.println(source); //that pagesource will be displayed in the console. 
		
		//driver.manage().window().maximize();//maximise the webpage
		//manage() is in Options class.
		
		//driver.manage().window().fullscreen(); //make the webpage in fullscreen mode
		
	driver.manage().window().minimize();
		
		

		
		
		
	}

}
