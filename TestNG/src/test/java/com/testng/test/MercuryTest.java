package com.testng.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class MercuryTest {
  
	WebDriver driver;
	
	@Test
  public void MercuryTest() {
  
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		
	}
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
	  driver = (WebDriver) new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
