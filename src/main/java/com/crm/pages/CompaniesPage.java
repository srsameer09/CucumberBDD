package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompaniesPage {
	
	 WebDriver driver;
	//Locator
	@FindBy(xpath="")
	WebElement userName;
	
	@FindBy(xpath="" ) 
	WebElement Pass;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;

	
	
	//Constructor
	public CompaniesPage(WebDriver driver) {
	
		this.driver = driver; 
		PageFactory.initElements(driver, this); //initializing all the web elements located by @FindBy
		
	}
}
