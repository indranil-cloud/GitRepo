package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngBasic3 {
  @Test
  public void firsttest3() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDriver\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Mercury project
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		/*System.out.println(driver.findElement(By.xpath("//input[@name='userName']")).isEnabled());
		System.out.println(driver.findElement(By.name("userName")).isEnabled());
		System.out.println(driver.findElement(By.name("userName")).isDisplayed());*/
		//driver.findElement(By.xpath("//input[@name='userName']"))
		driver.quit();
  }
}
