//file located in C:\Users\Daniel\Desktop\Selenium notes by Mam\Traversing.html

package xpathtypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingEx {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Daniel/Desktop/Selenium%20notes%20by%20Mam/Traversing.html");
	driver.manage().window().maximize();
	
	//path from 3 to 20cr:-
	String text = driver.findElement(By.xpath("//td[text()='3']/following-sibling::td[2]")).getText();
	System.out.println("3 to 20cr path: "+text);	
	
	//path from RRR to 1:-
	String RRR = driver.findElement(By.xpath("//*[.='RRR']/../preceding-sibling::tr[2]/td[text()='1']")).getText();
	System.out.println("RRR to 1 path: " +RRR);
	
	//path from 20cr to 1:
	String Num = driver.findElement(By.xpath("//*[.='20cr']/../preceding-sibling::tr[2]/td[1]")).getText();
	System.out.println(Num);

	
	}

}
