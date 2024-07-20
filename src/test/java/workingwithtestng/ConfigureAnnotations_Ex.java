package workingwithtestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//how this works... 
/*it will execute in this order
 * @BeforeSuite-->@BeforeTest-->@BeforeClass-->@BeforeMethod-->
 * @Test(accdg to priority)-->@AfterMethod-->@BeforeMehtod-->
 * @Test(testcase or priority wise)-->@AfterMethod-->@afterClass-->@AfterTest
 * -->@AfterSuite
 */
public class ConfigureAnnotations_Ex {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("connect to server");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("connect DB");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Launch browser");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("login ");
	}
	@Test(priority=1)
	public void testCase() {
		System.out.println("Test case passed");
	}
	@Test
	public void testCase02() {
		System.out.println("Test case 2 passed");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("logut");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("Close browser");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("disconnect DB");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("disconnect server");
	}
}
