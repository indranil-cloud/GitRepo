package com.selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngBasic {
  @Test
  public void firsttest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
		
		//Mercury project test
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
  }
}
