package ProductTest;

import org.testng.annotations.Test;

import Capabilities.CapabilityBase;

public class ProductTestCases extends CapabilityBase{
	@Test
	public void TC_Login() {
		
		base.get(testData.get("url"));
		login.login(testData.get("username"), testData.get("password"));
		login.Submit();

	}
	
	@Test
	public void TC_Login1() {
		
		base.get(testData.get("url"));
		login.login(testData.get("username"), testData.get("password"));
		login.Submit();

	}
}
