package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngBasic {
  @Test
  public void firsttest() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
		
		//Mercury project test
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//input[@name='userName']")).isEnabled());
		System.out.println(driver.findElement(By.name("userName")).isEnabled());
		System.out.println(driver.findElement(By.name("userName")).isDisplayed());
		//driver.findElement(By.xpath("//input[@name='userName']"))
		driver.quit();
  }
}
