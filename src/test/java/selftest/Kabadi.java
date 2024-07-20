package selftest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kabadi {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();
		
		
		//write path to print the points for puneri pultan:
		//so start from puneri text . when u see the htmlbody, puneri is one of the child under a parent called "table-data head" which further is a child of "row-head" .
		//so to start from sibling to another sibling of same parent, we follow following-sibling::and type the htmltag and attribute of cousin ie here points 
		
		String points = driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class='table-data points']")).getText();
		
		System.out.println(points);
		
		String form = driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class='table-data form']")).getText();
		
		System.out.println("form"+form);
		
		String score = driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class='table-data score-diff']")).getText();
		System.out.println("score:" +score);
		
		String matches = driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class='table-data matches-draw']")).getText();
		System.out.println("matches:" +matches);
		
		String lost = driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class='table-data matches-lost']")).getText();
		System.out.println("lost:" +lost);
		
		String won=driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class='table-data matches-won']")).getText();
		System.out.println("won:" +won);
		
		String play = driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class='table-data matches-play']")).getText();
		System.out.println("play:" +play);
		
		
		
	}

}
