package com.crm.base;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;

import com.crm.factory.DriverFactory;
import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
public class Base {

		//public static  WebDriver driver;
	private static String  title;
	protected LoginPage loginPage=new LoginPage(DriverFactory.getDriver());
	
	protected HomePage homepage;

		public static Logger log;
		
		//generate unique email id
		public String generateEmailId()
		{
			return(RandomStringUtils.randomAlphabetic(5));
		}
		
}
