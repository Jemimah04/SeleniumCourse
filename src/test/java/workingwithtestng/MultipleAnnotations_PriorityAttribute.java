package workingwithtestng;

import org.testng.annotations.Test;

public class MultipleAnnotations_PriorityAttribute {
	//execution starts whose priority number is low. so here register is 1. 
	//if number is same for 2 test cases then it will execute in alphabetical order
	//if number is -ve, -ve numbers will execute first .
	
	@Test(priority=1)
	public void register() {
		System.out.println("register");
	}
	
	@Test(priority=2)
public void login() {
	System.out.println("login");
}
	
	@Test(priority=3)
public void search(){
	System.out.println("search for the product");
}
	
	@Test(enabled = false) //false means this test case is skipped
	public void addToCart()
	{
		System.out.println("item added to cart");
	}
	

	@Test(enabled= false, priority=4) //using multiple attributes
public void placeOrder() {
	System.out.println("place the order");
}
	
	@Test(enabled=true) //here this test case is executed first, as prority is not given, it will take default priority as zero.	
public void logout() {	
	System.out.println("logout");
}


}
