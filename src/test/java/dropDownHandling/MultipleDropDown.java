package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/AllExamples.html ");

		//path for multiple dropdown web element
		WebElement carModel = driver.findElement(By.cssSelector("[title=SelectYourCar]"));
		Thread.sleep(1000);
		//create object for select class
		Select s  = new Select(carModel);
		//select multiple options.
		s.selectByIndex(1); //tesla
		Thread.sleep(1000);
		
		s.selectByValue("mercedes"); //mercedes
		Thread.sleep(1000);
		s.selectByVisibleText("Volvo"); //volvo
		Thread.sleep(1000);
		Thread.sleep(1000);
		
		//s.deselectAll();
		s.deselectByIndex(1); //tesla
		Thread.sleep(1000);
	s.deselectByValue("volvo");
	Thread.sleep(1000);
	s.deselectByVisibleText("Mercedes");
		
		
		
	}

}
