package practice;

import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

import javax.swing.text.Position;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class Resize_Postion_webpage {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.google.co.in/");
		
//		Dimension d= new Dimension(500,800);
//		driver.manage().window().setSize(d);
		
		Point p= new Point(300, 400);
		
		driver.manage().window().setPosition(p);
		
	}
}
