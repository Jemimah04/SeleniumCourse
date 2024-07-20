package dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllSelectedOption_DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/Notification%20and%20DropDowns.html");

		//path for the multiple option webelement
		WebElement multiSelect = driver.findElement(By.xpath("//select[@id='multiSelect']"));
		Select s = new Select(multiSelect);
		Thread.sleep(1000);
		s.selectByValue("Hyundai");
		Thread.sleep(1000);
		s.selectByVisibleText("Mercedes-Benz");
		Thread.sleep(1000);
		s.selectByVisibleText("jaguar");
		
		List<WebElement> allSelected = s.getAllSelectedOptions();
		for (WebElement allSel : allSelected) {
			System.out.println(allSel.getText());
				
		}
//		System.out.println(s.isMultiple()); ---->boolean return type
//
//		if(s.isMultiple())
//		{
//			System.out.println("its a multi select dropdown");
//		}
//		else
//			System.out.println("Its a single select dropdown");
//		
	
	}

}
