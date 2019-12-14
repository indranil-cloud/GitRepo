package com.banking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageobject.LoginPage;

public class Login_TC_001 extends BaseClass
{

	
	@Test
	public void LoginTest()
	{
		System.out.println("application :"+ url);
	driver.get(url);
	logger.info("url is opened");
	
	LoginPage lp = new LoginPage(driver);
	
	logger.info("enter username");
	lp.setUsrNme(uname);
	
	logger.info("enter password");
	lp.setPassword(pwd);
	
	lp.login();
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
	}
	else 
	{
	Assert.assertTrue(false);
	}
	}

}
