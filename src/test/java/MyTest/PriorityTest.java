package MyTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PriorityTest {
	
	@Test(priority=1)
	public void product() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("product");
		softAssert.assertEquals(false, true);
		System.out.println("after");
		
		softAssert.assertAll();
		
	}
	
	@Test(priority =-1)
	public void login() {
		
		System.out.println("login");
	}
	
	@Test(priority =-2)
	public void checkout() {
		
		System.out.println("checkout");
	}
	
	@Test
	public void payment() {
		
		System.out.println("payment");
	}

}
