package selftest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathTest {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//syntax1:- xpath by attribute
		driver.findElement(By.xpath("[data-csa-c-slot-id=\"nav_cs_5\"]")).click();
		
		//syntax2:- xpath by text
		driver.findElement(By.xpath("//a[@href=\"/amazon-coupons/b/?ie=UTF8&node=10465704031&ref_=sv_gb_4\"]")).click();

	}

}




