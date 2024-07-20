package workingwithtestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods_Attribute {
	
	@Test
	public void addAddress()
	{
		System.out.println("Address added");
		//Assert.fail();//---> this line is to make the test case fail
		
		
	}
	@Test(dependsOnMethods = "addAddress", priority=1)
	public void modifyAddress() {
		System.out.println("address modified");
		Assert.fail();
		
	}
	@Test(dependsOnMethods = "modifyAddress", enabled=true)
	public void deleteAddress() {
		System.out.println("Address deleted");
		//Assert.fail();
	}

}
