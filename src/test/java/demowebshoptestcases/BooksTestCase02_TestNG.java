package demowebshoptestcases;

import org.testng.annotations.Test;

import workingwithpom.BooksPage;
import workingwithpom.FictionEx;
import workingwithtestng.BaseClass;

public class BooksTestCase02_TestNG  extends BaseClass  {
	
	@Test
	public void booksTestCase02(){
		
		BooksPage book_page= new BooksPage(driver);
		book_page.getBooks().click();
		
		FictionEx fex= new FictionEx(driver);
		fex.getFictionEx().click();
		
	}

}
