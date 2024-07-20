//this class shows all the webdriver methods using amazon webpage

package selftest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		//method1: open url
		driver.get("https://www.amazon.in/");
		
		//method2: get title of the webpage
		String title = driver.getTitle();
		System.out.println("title:" +title);
		
		//method3: get page source
		//String pagesource = driver.getPageSource();
		//System.out.println(pagesource);
		
		//method4: get current url
		String url = driver.getCurrentUrl();
		System.out.println("webpage:" +url);
		
		//method5: maximize the webpage
		driver.manage().window().maximize();
		Thread.sleep(1000);
						
		//method6: full screen 
		driver.manage().window().fullscreen();
		Thread.sleep(1000);
				
		//method8: navigate forward
		driver.navigate().forward();
		Thread.sleep(1000);
				
		//method9: navigate refresh
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		//method10: navigate back
		driver.navigate().back();
		Thread.sleep(1000);
		
		//method7: minimize
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
		//method11: close
		driver.close();
		
		
		
	
		
	}

}
