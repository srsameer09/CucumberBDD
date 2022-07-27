package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//from object model we know that for every page you have to create a separate page class
public class LoginPage {

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
	public LoginPage(WebDriver driver) {
	
		this.driver = driver; 
		PageFactory.initElements(driver, this); //initializing all the web elements located by @FindBy
		
	}
	
	
	//Action classs
	public String getLoginPageTitle() {
		
		System.out.println("login title:"+driver.getTitle());
		return driver.getTitle();	
	}
	
	public boolean isForgotPasswordLnk() {
		 return  forgotPasswordLnk.isDisplayed();
		
	}
	
	public void enterUserName(String username) {
		
		userName.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		Pass.sendKeys(password);
		
	}
	
	public void clickBtn() {
		loginBtn.click();
	}
	
	public HomePage doLogin(String username,String password) {
		userName.sendKeys(username);
		Pass.sendKeys(username);
		loginBtn.click();
		return new HomePage(driver);
	}
}
