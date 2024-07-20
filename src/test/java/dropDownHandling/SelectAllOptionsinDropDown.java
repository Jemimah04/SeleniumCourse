package dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptionsinDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/AllExamples.html ");

//path for multiple dropdown web element
WebElement carModel = driver.findElement(By.cssSelector("[title=SelectYourCar]"));
Thread.sleep(1000);

Select s= new Select(carModel);
Thread.sleep(1000);

List<WebElement> allOptions = s.getOptions();
for (WebElement carOption : allOptions) {
	
	carOption.click();
	System.out.println(carOption.getText());
	
}

		
		
		
		
	}

}
