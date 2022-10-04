package com.first.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Mercury project
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		//driver.findElement(By.xpath("//input[@name='userName']"))
		driver.quit();
		
		
	}

}
