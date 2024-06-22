package com.practice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AllLinksExample {

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
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i =0; i<links.size();i++) {
			
			String value = links.get(i).getText();
			System.out.println(value);
			
			
		}

	}

}
