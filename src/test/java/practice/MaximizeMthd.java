package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeMthd {

	public static void main(String[] args) {
		
		
		
		WebDriver driver= new ChromeDriver();
		
		Options op= driver.manage();
		 Window win = op.window();
		//Object max = win.maximize();
		
		

	}

}
