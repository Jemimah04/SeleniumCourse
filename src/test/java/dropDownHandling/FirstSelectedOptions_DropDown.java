package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOptions_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/Notification%20and%20DropDowns.html");

//path for the multiple option webelement
WebElement multiSelect = driver.findElement(By.xpath("//select[@id='multiSelect']"));
Select s = new Select(multiSelect);
s.selectByIndex(7); //jeep
Thread.sleep(1000);
s.selectByValue("BMW"); //bmw
Thread.sleep(1000);
s.selectByVisibleText("Volkswagen");//Volkswagen

WebElement FirstSelection = s.getFirstSelectedOption();

System.out.println(FirstSelection.getText()); ///we get Volkswagen as op , bcoz in the selection option in webpage, driver will check from the top so from top, Volkswagen comes first. hence that is printed
Thread.sleep(1000);
//driver.close();
	}

}
