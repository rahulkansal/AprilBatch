package com.practice.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PopUpExample {

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
		
		driver.findElement(By.id("button4")).click();
		
		//Store the alert in a variable
		Alert alert = driver.switchTo().alert();

		String value = alert.getText();
		System.out.println(value);
		
		alert.accept();

		
	}

}
