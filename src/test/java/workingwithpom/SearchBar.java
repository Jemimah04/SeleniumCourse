package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBar {
	
	
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchbar;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	
	
	public SearchBar(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getSubmit() {
		return submit;
	}


	public WebElement getSearchbar() {
		return searchbar;
	}

	
}
