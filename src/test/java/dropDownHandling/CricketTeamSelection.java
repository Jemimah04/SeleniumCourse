package dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CricketTeamSelection {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/DropDown.html");
		
		//dropdown 1 path- cricket team members
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		
		Select s= new Select(dropdown1);
		s.selectByVisibleText("Ravichandran Ashwin");
		Thread.sleep(1000);
		s.selectByVisibleText("Virat Kohli");
		Thread.sleep(1000);
		s.selectByVisibleText("Hardik Pandya");
		Thread.sleep(1000);
		s.selectByVisibleText("Ravindra Jadeja");
		Thread.sleep(1000);
		s.selectByVisibleText("Mohammad Shami");
		Thread.sleep(1000);
		s.selectByVisibleText("Mohammed Siraj");
		Thread.sleep(1000);
		s.selectByVisibleText("Kuldeep Yadav");
		Thread.sleep(1000);
		s.selectByVisibleText("Sanju Samson");
		Thread.sleep(1000);
		s.selectByVisibleText("Yuzvendra Chahal");
		Thread.sleep(1000);
		s.selectByVisibleText("Shubman Gill");
		Thread.sleep(1000);
		s.selectByVisibleText("Shreyas Lyer");
		
		//path for dropdown2 selected cricket team
		
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='dropdown2']"));
		Select s2= new Select(dropdown2);
		Thread.sleep(1000);
		List<WebElement> newTeam = s2.getOptions();
		
		for (WebElement myTeam : newTeam) {
			//s2.getAllSelectedOptions();
			myTeam.click();
			System.out.println(myTeam.getText());
		}
		
	}

}
