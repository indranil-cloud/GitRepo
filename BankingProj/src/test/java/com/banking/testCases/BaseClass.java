package com.banking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.banking.Utilities.ReadConfig;

public class BaseClass 
{

	ReadConfig readconfig = new ReadConfig();
	
	public String url = readconfig.GetURL();
	public String uname = readconfig.GetUserName();
	public String pwd = readconfig.GetPassword();
	
	WebDriver driver;
	Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("Log4j.properties");	
		
		if(br.equals("chrome")) {
			
		System.setProperty("webdriver.chrome.driver",readconfig.GetChromePath());
		driver = new ChromeDriver();
		}
		else if(br.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver",readconfig.GetfirefoxPath());
		driver = new FirefoxDriver();	
		}

	
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
