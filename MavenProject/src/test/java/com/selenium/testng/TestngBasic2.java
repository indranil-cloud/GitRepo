package com.selenium.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngBasic2 {
  @Test
  public void firsttest2() {
	  
	  System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Mercury project
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//input[@name='userName']")).isEnabled());
		System.out.println(driver.findElement(By.name("userName")).isEnabled());
		System.out.println(driver.findElement(By.name("userName")).isDisplayed());
		//driver.findElement(By.xpath("//input[@name='userName']"))
		driver.quit();
  }
}
