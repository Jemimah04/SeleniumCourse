package scrollingConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformActionUsingJSE_Document {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		//to login the webpage without using Actions class and webElemnet ---this is imp interview question
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementsByClassName('email')[0].value='eilenesjemimah@gmail.com';");
		Thread.sleep(2000);
		
		js.executeScript("document.getElementsByClassName('password')[0].value='23224232';");
		Thread.sleep(2000);
		//js.executeScript("document.getElementsByClassName('button-1 login-button')[0].click;");//this approach doesnt work for login. also if there is no id, class or name 
		//js.executeScript("document.getElementsByClassName('button-1 login-button')[0].click;"); //attribute, then go for the below approach
		
		//2nd approach is:
		//if there is no id or class or name, then go to the webelement here its login button. inspect and write xpath for it.
		//now create a variable name for the webelement. then perform the click action on the login button using jse code.
		//syntax is js.executeScript("arguments[0].click;", args);
		
		
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log in']")); 
		
		js.executeScript("arguments[0].click();",loginButton);
		
	}

}
