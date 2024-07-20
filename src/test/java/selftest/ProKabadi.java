package selftest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProKabadi {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://www.prokabaddi.com/standings");
driver.manage().window().maximize();
//path to get points of Tamil thalaivaas
String points = driver.findElement(By.xpath("//p[text()='Tamil Thalaivas']/../../../following-sibling::div[@class='table-data points']")).getText();
System.out.println("points gained by Tamil Thalaivaas: " +points);		
//path to get points of bengaluru bulls and compare with tamil thalaivaas


}

}
