package workingwithtestng;

import org.testng.annotations.Test;
@Test
public class MultipleTestAnnotation {
	//eg: in retail shop, we need to order a product, first we register--login--search for product--place the order and logout
	//so create methods for each step.execution happens in alphabetical order of method name
	
	public void register() {
		System.out.println("register");
	}
	
public void login() {
	System.out.println("login");
}
	
public void search(){
	System.out.println("search for the product");
}
	
public void placeOrder() {
	System.out.println("place the order");
}
	
public void logout() {
	System.out.println("logout");
}

	
	
	

}
