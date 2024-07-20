//WebElement methods: 18 methods 
//1)sendKeys() 2)clear() 3) click() 4)submit() 5)getLocation() 6) getSize() 7)getRect() 8)isDisplayed() 
//9)isEnabled() 10) isSelected()11)getAttribute()  12)getDomAttribute()  13)getDomProperty() 
//14)getTagName()  15)getAccessibleName()  16)getAriaName()  17)getText() 18) getCssValue()

package xpathtypes;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.manage().window().maximize();
//		
		WebElement username = driver.findElement(By.id("user-name"));
//		//Method1: sendKeys()
		username.sendKeys("standard_user");   //we can store the locator path in var, so tht we can use multiple times
		
//		
//		Thread.sleep(2000);
//		
//		//Method2: clear()
//		username.clear();  //clear() used to clear the value sent already.
//		Thread.sleep(1000);
//		username.sendKeys("standard_user");
//		
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("secret_sauce");
//		
//		WebElement login = driver.findElement(By.id("login-button"));
//		//Method3: click()
//		login.click();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//Method 4: submit()
//		WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
//		search.sendKeys("Puma");
//		search.submit();  //used instead of ENTER key in the keyboard.
//		
//		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		//Method 5: getLocation()
//		Point location = mobile.getLocation();
//		System.out.println("X axis of Mobiles: " +location.getX());
//		System.out.println("Y axis of Mobiles:" +location.getY());
//		
//		//Method 6: getSize()  
//		Dimension sizeofMobile = mobile.getSize();
//		sizeofMobile.getHeight();
//		sizeofMobile.getWidth();
//		System.out.println("size of the element mobile: " +sizeofMobile);
//		
//		//Method 7: getRect()
//		Dimension rectDim = mobile.getRect().getDimension();
//		System.out.println("Dimension of mobile: "+rectDim);
//		
//		Point rectSize = mobile.getRect().getPoint();
//		System.out.println(rectSize);
		
//		//or we can use individually. getRect() has its own methods
//		int h = mobile.getRect().getHeight();
//		int w = mobile.getRect().getWidth();
//		int x = mobile.getRect().getX();
//		int y = mobile.getRect().getY();
//		
//		System.out.println("height: "+h);
//		System.out.println("width: "+w);
//		System.out.println("x axis: "+x);
//		System.out.println("y axis: "+y);
		
		
//		WebElement logo = driver.findElement(By.id("nav-logo-sprites"));
//		//Method 8: isDisplayed()
//		if(logo.isDisplayed()) {
//			System.out.println("the logo is displayed");
//		}
//		else
//			System.out.println("logo is not there");
		
		WebElement search1 = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		//Method 9: isEnabled()
		if(search1.isEnabled()) {
			search1.sendKeys("Toys");
		}
		else
			System.out.println("Element is disabled");
		
//		Thread.sleep(2000);
//		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//		
//		
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		Thread.sleep(1000);
//		
//		WebElement radio = driver.findElement(By.xpath("//input[@value=\"1\"]"));
//		radio.click();
//		//Method 10: isSelected()
//		if(radio.isSelected()) {
//			System.out.println("radio button is selected");
//		}
//		else
//			System.out.println("radio button is not selected");
//Method 11: getAttribute()
	WebElement Mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));	
		System.out.println(Mob.getAttribute("href"));
		
//Method 12: getDomAttribute()	
//	WebElement DOM = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']"));	
//	System.out.println(DOM.getDomAttribute("data-csa-c-id"));	

//Method 13: getDomProperty()
//	WebElement sell = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
//	System.out.println(sell.getDomProperty("href"));	
		
		
//Method 14: getTagName()
		//System.out.println("htmltag:" +Mob.getTagName());   //give htmltag name
		
//Method 15: getAccessibleName()		
		System.out.println(Mob.getAccessibleName());  //gives exact name how it is in the webpage
		
//Method 16: getAriaName()		
		System.out.println(Mob.getAriaRole());  //gives what type of element it is. either radiobutton, or img, or link, text

//Method 17: getText()
		//WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		//searchBar.sendKeys("soft toys");
		//searchBar.submit();
		//driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Amazon Brand - Jam & Honey Unicorn Plush/Soft Toy, Suitable for Boys, Girls and Kids, Super-Soft, Safe, 15 ...']")).click();
		//unicorn.getText();
		
//Method 18: getCssValue()
//		 driver.get("https://www.facebook.com/");
//		WebElement lgo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
//		
//		System.out.println(lgo.getCssValue("color"));
//		System.out.println(lgo.getCssValue("font"));
	}

}
