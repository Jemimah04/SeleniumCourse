package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	
	@FindBy(xpath = "//a[@class=\"ico-logout\"]")
	private WebElement logout;
	
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getLogout() {
		return logout;
	}

}
