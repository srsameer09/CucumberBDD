package com.crm.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();
	
	public WebDriver init_driver(String browser) {
		System.out.println("browser value is: " + browser);
		
		if (browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver()); //thread local driver actually will give you a method set method and get method so set meter means now new chrome driver.the object of the chrome driver will be created and it will be set with thread local drivers
			                                  //when you initialize your chrome driver please set it with the thread local driver so it will create a local a driver copy for the specific thread over there so whenever someone is going to set automatically chrome driver will be ascent with the thread local driver and through the local driver is actually having the instance of a web driver over here
			//driver=new ChromeDriver();
			
		}
		else if (browser.equals("Firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
			//driver=new FirefoxDriver();
		}
		
		else {
			System.out.println("provide correct browser name"+browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		
		return getDriver();
		
		
	}
	
	//synchronized
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	
	
	

}
