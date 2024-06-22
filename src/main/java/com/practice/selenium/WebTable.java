package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

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
		driver.get("https://webdriveruniversity.com/Data-Table/index.html");
		
		int rows = driver.findElements(By.xpath("//table[@id='t01']//tr")).size();
		System.out.println(rows);
		
		int columns = driver.findElements(By.xpath("//table[@id='t01']//tr[1]//th")).size();
		System.out.println(columns);
		
		String value = driver.findElement(By.xpath("//table[@id='t01']//tr[2]//td[1]")).getText();
		System.out.println(value);

		
	}

}
