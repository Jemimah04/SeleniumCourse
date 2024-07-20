package workingwithpom;

import org.testng.annotations.Test;

import workingwithtestng.BaseClass;

public class TestCase01_TestNG_BaseclassExtending extends BaseClass{
	
	
	@Test
	public void testCase01() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Test case 01 is executed");
	}
	
	

}
