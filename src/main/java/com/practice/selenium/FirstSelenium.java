package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstSelenium {

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
		driver.get("https://www.google.com");
		String title = driver.getTitle(); 
		System.out.println(title);
		
		driver.close();

	}

}
