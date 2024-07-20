package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(xpath = "//a[text()=\"Log in\"]")
	private WebElement loginpageLink;
	
	@FindBy(xpath = "//a[@class=\"ico-logout\"]")
	private WebElement logout;


//constructor
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void Logout(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}



public WebElement getLoginpageLink() {
	return loginpageLink;
}
public WebElement getLogout() {
	return logout;
}
}