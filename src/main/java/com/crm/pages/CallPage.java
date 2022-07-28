package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CallPage {

	 WebDriver driver;
	//Locator
	
	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(how=How.NAME, using= "password" ) 
	WebElement Pass;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password?')]")
	WebElement forgotPasswordLnk;
	
	
	//Constructor
	public CallPage(WebDriver driver) {
	
		this.driver = driver; 
		PageFactory.initElements(driver, this); //initializing all the web elements located by @FindBy
		
	}
}
