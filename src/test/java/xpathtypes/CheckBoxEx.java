package xpathtypes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxEx {

public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
driver.get("file:///C:/Users/Daniel/Desktop/Selenium%20notes%20by%20Mam/checkbox.html");
driver.manage().window().maximize();

//path to select checkbox 1 and checkbox 4
//WebElement checkbox = driver.findElement(By.xpath("//*[@type='checkbox'][1]|//*[@type='checkbox'][4]"));  
//if(checkbox.isSelected()) {
//	System.out.println("The checkboxes are enabled");
//}
//else
//{
//	System.out.println("The checkboxes are disabled");
//}
//path to select checkbox between 2 and 5
//List<WebElement> ele = driver.findElements(By.xpath("(//input[@type='checkbox'])[position()>=1 and position()<=5]"));
//for (WebElement webElement : ele) {
//	webElement.click();
//	Thread.sleep(1000);
//}


//to select multiple checkbox between 3 and 6 ie.4,5
List<WebElement> next = driver.findElements(By.xpath("(//input[@type=\"checkbox\"])[position()>3 and position()<6]"));
for (WebElement webElement : next) {
	webElement.click();
	Thread.sleep(1000);
}







}

}
