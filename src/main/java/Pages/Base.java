package Pages;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Capabilities.CapabilityBase;

public class Base extends CapabilityBase {

	public void get(String urlValue) {

		driver.get(urlValue);
		extentTest.log(LogStatus.PASS, "application url has been opened");
	}

	public void sendKeys(WebElement element, String value, ExtentTest extentTest, String message) {

		element.sendKeys(value);
		extentTest.log(LogStatus.PASS, message);
	}

	public void click(WebElement element, ExtentTest extentTest, String message) {

		element.click();
		extentTest.log(LogStatus.PASS, message);
	}

}
