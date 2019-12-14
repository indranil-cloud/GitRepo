package com.banking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig()
	{
	
		try {
		File src = new File("./Configuration\\config.properties");
		FileInputStream fis = new FileInputStream(src);
		pro = new Properties();
		pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("exception :"+ e.getMessage());
		}
	}
		public String GetURL() {
			String baseurl = pro.getProperty("url");
			return baseurl;
		}
		public String GetUserName() {
			String username = pro.getProperty("uname");
			return username;
		}
		public String GetPassword() {
			String password = pro.getProperty("pwd");
			return password;
		}
		public String GetChromePath() {
			String cpath = pro.getProperty("chromepath");
			return cpath;
		}
		public String GetfirefoxPath() {
			String fpath = pro.getProperty("firefoxpath");
			return fpath;
		}
	
}