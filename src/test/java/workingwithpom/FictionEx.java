package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionEx {
	
	
	@FindBy(xpath = "//a[text()='Fiction EX']")
	private WebElement FictionExPage;
	
	
	
	public FictionEx(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getFictionEx() {
		return FictionExPage;
	}

}
