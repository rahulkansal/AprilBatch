package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Capabilities.CapabilityBase;

public class LoginPageObject extends CapabilityBase {

	@FindBy(id="text")
    WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginButton;

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public LoginPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	
}
