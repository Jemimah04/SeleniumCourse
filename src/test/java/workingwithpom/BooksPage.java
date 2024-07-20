package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	
	@FindBy(xpath="//ul[@class=\"top-menu\"]//a[contains(text(),\"Books\")]")
	private WebElement books;
	
public BooksPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getBooks() {
	return books;
}

}
