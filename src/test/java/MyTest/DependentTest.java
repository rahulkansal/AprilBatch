package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentTest {

	@Test(enabled = false)
	public void login() {
		
		System.out.println("login");
		Assert.assertEquals(true, false);
		}
	
	@Test(dependsOnMethods = { "login"} , alwaysRun = true)
	public void TC1() {
		
	}
				
}
