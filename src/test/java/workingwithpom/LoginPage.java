package workingwithpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
		@FindBy(id="Email")
		private WebElement emailTextField;
		
		@FindBy(name="Password")
		private WebElement passwordTextField;
		
		@FindBy(css="[type='checkbox']")
		private WebElement rememberMeCheckBox;
		
		@FindBy(linkText="Forgot password?")
		private WebElement forgotPasswordLink;
		
		@FindBy(xpath = "//input[@value=\"Log in\"]")
		private WebElement loginButton;
		
		//create constructor using page factory
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this); //this keyword holds the current addr
			
		}

		public WebElement getEmailTextField() {
			return emailTextField;
		}

		public WebElement getPasswordTextField() {
			return passwordTextField;
		}

		public WebElement getRememberMeCheckBox() {
			return rememberMeCheckBox;
		}

		public WebElement getForgotPasswordLink() {
			return forgotPasswordLink;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}
		
		//to access the private variables, right click on program--source--generate getters and setters--- click on generate getters
		
		
		
		
		



}
