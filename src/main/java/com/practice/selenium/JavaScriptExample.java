package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		String browser = "edge";
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(); 
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver(); 
		}

		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		
		WebElement button = driver.findElement(By.id("button4"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
        js.executeScript("arguments[0].click();", button);

	}

}
