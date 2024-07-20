//launch empty browser - 2 ways
package myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//approach 1: sle.ver 3.141.59
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver1= new ChromeDriver();
//		driver1.manage().window().maximize();
		
		//approach 2: sel ver 4.19.1 and above , we dont need any broswer servers.
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	
	}

}
