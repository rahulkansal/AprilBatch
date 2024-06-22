package com.practice.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkTextExample {

	public static void main(String[] args) throws InterruptedException {
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

		driver.findElement(By.linkText("हिन्दी")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Eng")).click();
	}

}
