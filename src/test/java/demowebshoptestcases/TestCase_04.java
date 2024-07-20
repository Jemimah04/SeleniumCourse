package demowebshoptestcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import datadriventesting.DataUtility;

public class TestCase_04 {
//to add Simple Computer in cart and remove from cart and logout from demo web shop
	
	public static void main(String[] args) throws IOException {
	
		DataUtility dataUtil= new DataUtility();
		
		String value=dataUtil.getDataFromExcel("Sheet1", 1, 0);
		String HomePageTitle= dataUtil.getDataFromExcel("Sheet1", 1, 1);
		String LoginpageTitle= dataUtil.getDataFromExcel("Sheet1", 2, 1);
		String ComputersPageTitle= dataUtil.getDataFromExcel("Sheet1", 3, 1);
		String ShoppingCartTitle= dataUtil.getDataFromExcel("Sheet1", 4, 1);
		System.out.println(value+"from excel");
		System.out.println(HomePageTitle+"from excel");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(dataUtil.getDataFromProperties("url"));

if(driver.getTitle().equals(HomePageTitle))
{
	System.out.println("The DemoWebShop webpage is displayed");
}
else
{
	System.out.println("The DemoWebShop webpage is not displyed");
}
//to click on Login
driver.findElement(By.xpath("//a[text()='Log in']")).click();
if(driver.getTitle().equals(LoginpageTitle))
{
	System.out.println("Login page displayed");
}
else
{
	System.out.println("Login page displayed");
}
//to enter email and password 

driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(dataUtil.getDataFromProperties("email"));
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(dataUtil.getDataFromProperties("password"));
driver.findElement(By.xpath("//input[@value='Log in']")).click();

//mouse over Computers
WebElement Computers = driver.findElement(By.xpath("//ul[@class='top-menu']//li[2]//a[contains(text(),'Computers')]"));
Actions act= new Actions(driver);
act.moveToElement(Computers).click().perform();

//validate Computers page
if(driver.getTitle().equals(ComputersPageTitle))
{
	System.out.println("Computers page displayed");
}
else
{
	System.out.println("Computers page not displayed");
}

//to click on Desktops
driver.findElement(By.xpath("//a[contains(text(),' Desktops')]")).click();
//click on Simple computer
//use JavascriptExecutor to scroll to Simple computer
WebElement simpleComputer =driver.findElement(By.xpath("//div[@class='product-grid']//a[text()='Simple Computer']"));
JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView(true)",simpleComputer);
simpleComputer.click();

////to select slow in Processor
driver.findElement(By.xpath("//label[text()='Slow ']")).click();
//click on add to cart
driver.findElement(By.xpath("//input[@id='add-to-cart-button-75']")).click();
////click on shopping cart page
driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();

if(driver.getTitle().equals(ShoppingCartTitle))
{
	System.out.println("Shopping cart page is displayed");
}
else
{
	System.out.println("Shopping cart page is not displayed");
}	
//to remove product from cart--click on edit
driver.findElement(By.xpath("//a[text()='Edit']")).click();
driver.findElement(By.xpath("//input[@id='addtocart_75_EnteredQuantity']")).clear();
//click on update to update the shopping cart
driver.findElement(By.xpath("//input[@id='add-to-cart-button-75']")).click();
//go to shopping cart to check whether the product is removed
driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
String cartEmpty = driver.findElement(By.xpath("//div[contains(text(), 'Your Shopping Cart is empty!')]")).getText();

System.out.println(cartEmpty);
//logout
driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
driver.close();




		
		
		
		
}

}
