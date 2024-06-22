package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;


public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
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
		
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(scrFile, new File("C:\\Users\\rniwas2\\eclipse-workspace\\MayWeekendBatch\\failed_1.png"));
        
        WebElement element = driver.findElement(By.xpath("//img[@alt='Indian Premier League Final 2024']"));
        File scrFile = element.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("C:\\Users\\rniwas2\\eclipse-workspace\\MayWeekendBatch\\failed_2.png"));
        
        String value = "Business";
        
        driver.findElement(By.xpath("//a[text()='"+value+"']")).click();


		
	}

}
