package Pages;

import Capabilities.CapabilityBase;
import POM.LoginPageObject;

public class Login extends CapabilityBase {

	LoginPageObject loginPageObject = new LoginPageObject();
	Base base = new Base();
	
	public void login(String userValue, String paswordValue) {
		
		base.sendKeys(loginPageObject.getUserName(), userValue, extentTest, "Enter User Name value");		
		base.sendKeys(loginPageObject.getPassword(), paswordValue, extentTest, "Enter password value");		
		
	}
	
	public void Submit() {
		
		base.click(loginPageObject.getLoginButton(), extentTest, "click on login submit button");
			
	}
	
	
}
